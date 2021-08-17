package com.hcl.hclmessaging.service.conversion;

import com.hcl.hclmessaging.dto.auro.Address;
import com.hcl.hclmessaging.dto.auro.Attributes;
import com.hcl.hclmessaging.dto.auro.Data;
import com.hcl.hclmessaging.dto.auro.Image;
import com.hcl.hclmessaging.dto.auro.KafkaOrderMessageDTO;
import com.hcl.hclmessaging.dto.auro.LineItem;
import com.hcl.hclmessaging.dto.auro.LineItemPrice;
import com.hcl.hclmessaging.dto.auro.OrderTotal;
import com.hcl.hclmessaging.dto.auro.PaymentInfo;
import com.hcl.hclmessaging.dto.auro.Price;
import com.hcl.hclmessaging.dto.auro.ShippingMethod;
import com.hcl.hclmessaging.dto.auro.Sku;
import com.hcl.hclmessaging.dto.order.Attribute;
import com.hcl.hclmessaging.dto.order.Notification;
import com.hcl.hclmessaging.dto.order.Order;
import com.hcl.hclmessaging.dto.order.ShippingInfo;
import com.hcl.hclmessaging.utils.ConversionUtils;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.hcl.hclmessaging.utils.ConversionUtils.toByteBuffer;
import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;
import static org.springframework.util.CollectionUtils.isEmpty;

@Service
@AllArgsConstructor
@Slf4j
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class NotificationOrderConverter implements Converter<Notification, KafkaOrderMessageDTO> {

    @Override
    public KafkaOrderMessageDTO convert(Notification source) {
        KafkaOrderMessageDTO result = new KafkaOrderMessageDTO();
        result.setData(convertToData(source));
        return result;
    }

    private Data convertToData(Notification source) {
        Data data = new Data();
        data.setId(source.getOrder().getId());
        data.setType("orders");
        data.setAttributes(buildAttributes(source.getOrder()));
        return data;
    }

    private Attributes buildAttributes(Order order) {
        if (order != null) {
            Attributes result = new Attributes();
            result.setCreatedAt(order.getCreatedAt());
            result.setLastModifiedAt(order.getLastModifiedAt());
            result.setOrderNumber(order.getOrderNumber());
            result.setChannel(order.getCustom().getFields().getChannel());
            List<LineItem> lineItems = convertLineItems(order.getLineItems());
            result.setLineItems(lineItems);
            result.setTotalQuantity(extractTotalQuantity(lineItems));
            result.setOverallDeliveryType("mixed");
            result.setShippingAddress(convertAddress(order.getShippingAddress()));
            result.setBillingAddress(convertAddress(order.getBillingAddress()));
            result.setShippingMethod(extractShippingMethod(order));
            result.setPaymentInfo(extractPaymentInfo(order));
            result.setOrderTotal(extractOrderTotal(order, lineItems));
            return result;
        }
        return null;
    }

    private Integer extractTotalQuantity(List<LineItem> lineItems) {
        if (!isEmpty(lineItems)) {
            return lineItems.stream()
                    .filter(item -> item != null && item.getQuantity() != null)
                    .mapToInt(LineItem::getQuantity)
                    .sum();
        }
        return null;
    }

    private OrderTotal extractOrderTotal(Order order, List<LineItem> lineItems) {
        OrderTotal result = new OrderTotal();
        Price price = extractPrice(order.getTotalPrice());
        if (price != null) {
            result.setCurrencyCode(price.getCurrencyCode());
            result.setTotal(price.getPrice());
        }
        if (order.getShippingInfo() != null && order.getShippingInfo().getTaxedPrice() != null) {
            price = extractPrice(order.getShippingInfo().getTaxedPrice().getTotalGross());
            if (price != null) {
                result.setShipping(price.getPrice());
            }
        }
        result.setTax(extractTax(order));
        //TODO: It is unclear where to get discount
        result.setDiscount(toByteBuffer(BigDecimal.ZERO));
        result.setSubtotal(extractSubTotal(lineItems));
        return result;
    }

    private ByteBuffer extractSubTotal(List<LineItem> lineItems) {
        if (!isEmpty(lineItems)) {
            return toByteBuffer(lineItems.stream()
                    .filter(item -> item != null && item.getSku() != null
                            && item.getSku().getLineItemPrice() != null && item.getSku().getLineItemPrice().getItemPriceBeforeDiscount() != null)
                    .map(item -> item.getSku().getLineItemPrice().getItemPriceBeforeDiscount())
                    .map(ConversionUtils::toBigDecimal)
                    .reduce(BigDecimal.ZERO, BigDecimal::add));
        }
        return null;
    }

    private ByteBuffer extractTax(Order order) {
        if (order.getTaxedPrice() != null && !isEmpty(order.getTaxedPrice().getTaxPortions())) {
            return toByteBuffer(order.getTaxedPrice().getTaxPortions()
                    .stream()
                    .map(item -> extractPrice(item.getAmount()))
                    .filter(Objects::nonNull)
                    .map(Price::getPrice)
                    .filter(Objects::nonNull)
                    .map(ConversionUtils::toBigDecimal)
                    .reduce(BigDecimal.ZERO, BigDecimal::add));
        }
        return null;
    }

    private PaymentInfo extractPaymentInfo(Order order) {
        return new PaymentInfo();
    }

    private ShippingMethod extractShippingMethod(Order order) {
        ShippingInfo shippingInfo = order.getShippingInfo();
        ShippingMethod result = new ShippingMethod();
        result.setId(shippingInfo.getShippingMethod().getId());
        result.setName(shippingInfo.getShippingMethodName());
        result.setPrice(extractPrice(shippingInfo.getPrice()));
        return result;
    }

    private Price extractPrice(com.hcl.hclmessaging.dto.order.Price source) {
        if (source != null) {
            Price result = new Price();
            result.setCurrencyCode(source.getCurrencyCode());
            result.setPrice(toByteBuffer(BigDecimal.valueOf(source.getCentAmount())
                    .divide(BigDecimal.valueOf(100))));
            return result;
        }
        return null;
    }

    private Address convertAddress(com.hcl.hclmessaging.dto.order.Address source) {
        Address result = new Address();
        result.setAddress(source.getStreetName());
        result.setCity(source.getCity());
        result.setEmail(source.getEmail());
        result.setDeliveryNote(source.getAdditionalAddressInfo());
        result.setFirstName(source.getFirstName());
        result.setLastName(source.getLastName());
        result.setPhoneNumber(source.getPhone());
        result.setState(source.getState());
        return result;
    }

    private List<LineItem> convertLineItems(List<com.hcl.hclmessaging.dto.order.LineItem> lineItems) {
        if (!isEmpty(lineItems)) {
            return lineItems.stream().map(this::convertLineItem).collect(toList());
        }
        return emptyList();
    }

    private LineItem convertLineItem(com.hcl.hclmessaging.dto.order.LineItem source) {
        LineItem result = new LineItem();
        result.setId(source.getId());
        result.setFulfillmentType(source.getCustom().getFields().getFulfillmentType());
        result.setProductId(source.getProductId());
        result.setQuantity(source.getQuantity());
        result.setStoreId(source.getCustom().getFields().getStoreId());
        result.setProductName(source.getName().get("en-US"));
        result.setSku(buildSku(source));
        return result;
    }

    private Sku buildSku(com.hcl.hclmessaging.dto.order.LineItem source) {
        Sku result = new Sku();
        result.setId(source.getVariant().getId());
        result.setCode(source.getVariant().getSku());
        result.setImages(convertImages(source.getVariant().getImages()));
        result.setLineItemPrice(buildLineItemPrice(source));
        result.setAttributes(extractAttributes(source));
        return result;
    }

    private Map<CharSequence, CharSequence> extractAttributes(com.hcl.hclmessaging.dto.order.LineItem source) {
        if (source.getVariant() != null && !isEmpty(source.getVariant().getAttributes())) {
            return source.getVariant().getAttributes().stream()
                    .collect(Collectors.toMap(Attribute::getName, Attribute::getValue));
        }
        return null;
    }

    private LineItemPrice buildLineItemPrice(com.hcl.hclmessaging.dto.order.LineItem source) {
        LineItemPrice result = new LineItemPrice();
        result.setCurrencyCode(source.getTotalPrice().getCurrencyCode());
        Integer centAmount = source.getTotalPrice().getCentAmount();
        //TODO, Need understand where to get discount. It is missing in request
        result.setItemPriceAfterDiscount(toByteBuffer(BigDecimal.valueOf(centAmount)
                .divide(BigDecimal.valueOf(100))));
        result.setItemPriceBeforeDiscount(toByteBuffer(BigDecimal.valueOf(centAmount)
                .divide(BigDecimal.valueOf(100))));

        result.setDiscount(toByteBuffer(BigDecimal.ZERO));
        return result;
    }

    private List<Image> convertImages(List<com.hcl.hclmessaging.dto.order.Image> images) {
        if (!isEmpty(images)) {
            return images.stream().map(this::convertToImage).collect(Collectors.toList());
        }
        return emptyList();
    }

    private Image convertToImage(com.hcl.hclmessaging.dto.order.Image item) {
        Image result = new Image();
        result.setUrl(item.getUrl());
        return result;
    }
}
