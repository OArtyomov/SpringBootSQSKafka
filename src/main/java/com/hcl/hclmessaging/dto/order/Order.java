
package com.hcl.hclmessaging.dto.order;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "version",
    "lastMessageSequenceNumber",
    "createdAt",
    "lastModifiedAt",
    "lastModifiedBy",
    "createdBy",
    "orderNumber",
    "totalPrice",
    "taxedPrice",
    "country",
    "orderState",
    "syncInfo",
    "returnInfo",
    "shippingInfo",
    "taxMode",
    "inventoryMode",
    "taxRoundingMode",
    "taxCalculationMode",
    "origin",
    "lineItems",
    "customLineItems",
    "transactionFee",
    "discountCodes",
    "cart",
    "custom",
    "paymentInfo",
    "shippingAddress",
    "billingAddress",
    "itemShippingAddresses",
    "refusedGifts"
})
public class Order {

    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("lastMessageSequenceNumber")
    private Integer lastMessageSequenceNumber;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("lastModifiedAt")
    private String lastModifiedAt;
    @JsonProperty("lastModifiedBy")
    private LastModifiedBy lastModifiedBy;
    @JsonProperty("createdBy")
    private CreatedBy createdBy;
    @JsonProperty("orderNumber")
    private String orderNumber;
    @JsonProperty("totalPrice")
    private Price totalPrice;
    @JsonProperty("taxedPrice")
    private TaxedPrice taxedPrice;
    @JsonProperty("country")
    private String country;
    @JsonProperty("orderState")
    private String orderState;
    @JsonProperty("syncInfo")
    private List<Object> syncInfo = null;
    @JsonProperty("returnInfo")
    private List<Object> returnInfo = null;
    @JsonProperty("shippingInfo")
    private ShippingInfo shippingInfo;
    @JsonProperty("taxMode")
    private String taxMode;
    @JsonProperty("inventoryMode")
    private String inventoryMode;
    @JsonProperty("taxRoundingMode")
    private String taxRoundingMode;
    @JsonProperty("taxCalculationMode")
    private String taxCalculationMode;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("lineItems")
    private List<LineItem> lineItems = null;
    @JsonProperty("customLineItems")
    private List<Object> customLineItems = null;
    @JsonProperty("transactionFee")
    private Boolean transactionFee;
    @JsonProperty("discountCodes")
    private List<Object> discountCodes = null;
    @JsonProperty("cart")
    private Cart cart;
    @JsonProperty("custom")
    private Custom custom;
    @JsonProperty("paymentInfo")
    private PaymentInfo paymentInfo;
    @JsonProperty("shippingAddress")
    private Address shippingAddress;
    @JsonProperty("billingAddress")
    private Address billingAddress;
    @JsonProperty("itemShippingAddresses")
    private List<Object> itemShippingAddresses = null;
    @JsonProperty("refusedGifts")
    private List<Object> refusedGifts = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @JsonProperty("lastMessageSequenceNumber")
    public Integer getLastMessageSequenceNumber() {
        return lastMessageSequenceNumber;
    }

    @JsonProperty("lastMessageSequenceNumber")
    public void setLastMessageSequenceNumber(Integer lastMessageSequenceNumber) {
        this.lastMessageSequenceNumber = lastMessageSequenceNumber;
    }

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("lastModifiedAt")
    public String getLastModifiedAt() {
        return lastModifiedAt;
    }

    @JsonProperty("lastModifiedAt")
    public void setLastModifiedAt(String lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy() {
        return lastModifiedBy;
    }

    @JsonProperty("lastModifiedBy")
    public void setLastModifiedBy(LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("createdBy")
    public void setCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("orderNumber")
    public String getOrderNumber() {
        return orderNumber;
    }

    @JsonProperty("orderNumber")
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @JsonProperty("totalPrice")
    public Price getTotalPrice() {
        return totalPrice;
    }

    @JsonProperty("totalPrice")
    public void setTotalPrice(Price totalPrice) {
        this.totalPrice = totalPrice;
    }

    @JsonProperty("taxedPrice")
    public TaxedPrice getTaxedPrice() {
        return taxedPrice;
    }

    @JsonProperty("taxedPrice")
    public void setTaxedPrice(TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("orderState")
    public String getOrderState() {
        return orderState;
    }

    @JsonProperty("orderState")
    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    @JsonProperty("syncInfo")
    public List<Object> getSyncInfo() {
        return syncInfo;
    }

    @JsonProperty("syncInfo")
    public void setSyncInfo(List<Object> syncInfo) {
        this.syncInfo = syncInfo;
    }

    @JsonProperty("returnInfo")
    public List<Object> getReturnInfo() {
        return returnInfo;
    }

    @JsonProperty("returnInfo")
    public void setReturnInfo(List<Object> returnInfo) {
        this.returnInfo = returnInfo;
    }

    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    @JsonProperty("shippingInfo")
    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    @JsonProperty("taxMode")
    public String getTaxMode() {
        return taxMode;
    }

    @JsonProperty("taxMode")
    public void setTaxMode(String taxMode) {
        this.taxMode = taxMode;
    }

    @JsonProperty("inventoryMode")
    public String getInventoryMode() {
        return inventoryMode;
    }

    @JsonProperty("inventoryMode")
    public void setInventoryMode(String inventoryMode) {
        this.inventoryMode = inventoryMode;
    }

    @JsonProperty("taxRoundingMode")
    public String getTaxRoundingMode() {
        return taxRoundingMode;
    }

    @JsonProperty("taxRoundingMode")
    public void setTaxRoundingMode(String taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
    }

    @JsonProperty("taxCalculationMode")
    public String getTaxCalculationMode() {
        return taxCalculationMode;
    }

    @JsonProperty("taxCalculationMode")
    public void setTaxCalculationMode(String taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
    }

    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("lineItems")
    public List<LineItem> getLineItems() {
        return lineItems;
    }

    @JsonProperty("lineItems")
    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    @JsonProperty("customLineItems")
    public List<Object> getCustomLineItems() {
        return customLineItems;
    }

    @JsonProperty("customLineItems")
    public void setCustomLineItems(List<Object> customLineItems) {
        this.customLineItems = customLineItems;
    }

    @JsonProperty("transactionFee")
    public Boolean getTransactionFee() {
        return transactionFee;
    }

    @JsonProperty("transactionFee")
    public void setTransactionFee(Boolean transactionFee) {
        this.transactionFee = transactionFee;
    }

    @JsonProperty("discountCodes")
    public List<Object> getDiscountCodes() {
        return discountCodes;
    }

    @JsonProperty("discountCodes")
    public void setDiscountCodes(List<Object> discountCodes) {
        this.discountCodes = discountCodes;
    }

    @JsonProperty("cart")
    public Cart getCart() {
        return cart;
    }

    @JsonProperty("cart")
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @JsonProperty("custom")
    public Custom getCustom() {
        return custom;
    }

    @JsonProperty("custom")
    public void setCustom(Custom custom) {
        this.custom = custom;
    }

    @JsonProperty("paymentInfo")
    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    @JsonProperty("paymentInfo")
    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    @JsonProperty("shippingAddress")
    public Address getShippingAddress() {
        return shippingAddress;
    }

    @JsonProperty("shippingAddress")
    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @JsonProperty("billingAddress")
    public Address getBillingAddress() {
        return billingAddress;
    }

    @JsonProperty("billingAddress")
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    @JsonProperty("itemShippingAddresses")
    public List<Object> getItemShippingAddresses() {
        return itemShippingAddresses;
    }

    @JsonProperty("itemShippingAddresses")
    public void setItemShippingAddresses(List<Object> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
    }

    @JsonProperty("refusedGifts")
    public List<Object> getRefusedGifts() {
        return refusedGifts;
    }

    @JsonProperty("refusedGifts")
    public void setRefusedGifts(List<Object> refusedGifts) {
        this.refusedGifts = refusedGifts;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.lastModifiedAt == null)? 0 :this.lastModifiedAt.hashCode()));
        result = ((result* 31)+((this.orderNumber == null)? 0 :this.orderNumber.hashCode()));
        result = ((result* 31)+((this.totalPrice == null)? 0 :this.totalPrice.hashCode()));
        result = ((result* 31)+((this.taxedPrice == null)? 0 :this.taxedPrice.hashCode()));
        result = ((result* 31)+((this.shippingInfo == null)? 0 :this.shippingInfo.hashCode()));
        result = ((result* 31)+((this.origin == null)? 0 :this.origin.hashCode()));
        result = ((result* 31)+((this.refusedGifts == null)? 0 :this.refusedGifts.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.cart == null)? 0 :this.cart.hashCode()));
        result = ((result* 31)+((this.orderState == null)? 0 :this.orderState.hashCode()));
        result = ((result* 31)+((this.inventoryMode == null)? 0 :this.inventoryMode.hashCode()));
        result = ((result* 31)+((this.returnInfo == null)? 0 :this.returnInfo.hashCode()));
        result = ((result* 31)+((this.lineItems == null)? 0 :this.lineItems.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.customLineItems == null)? 0 :this.customLineItems.hashCode()));
        result = ((result* 31)+((this.itemShippingAddresses == null)? 0 :this.itemShippingAddresses.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.discountCodes == null)? 0 :this.discountCodes.hashCode()));
        result = ((result* 31)+((this.lastModifiedBy == null)? 0 :this.lastModifiedBy.hashCode()));
        result = ((result* 31)+((this.custom == null)? 0 :this.custom.hashCode()));
        result = ((result* 31)+((this.taxCalculationMode == null)? 0 :this.taxCalculationMode.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.lastMessageSequenceNumber == null)? 0 :this.lastMessageSequenceNumber.hashCode()));
        result = ((result* 31)+((this.syncInfo == null)? 0 :this.syncInfo.hashCode()));
        result = ((result* 31)+((this.taxRoundingMode == null)? 0 :this.taxRoundingMode.hashCode()));
        result = ((result* 31)+((this.transactionFee == null)? 0 :this.transactionFee.hashCode()));
        result = ((result* 31)+((this.createdBy == null)? 0 :this.createdBy.hashCode()));
        result = ((result* 31)+((this.taxMode == null)? 0 :this.taxMode.hashCode()));
        result = ((result* 31)+((this.shippingAddress == null)? 0 :this.shippingAddress.hashCode()));
        result = ((result* 31)+((this.billingAddress == null)? 0 :this.billingAddress.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.paymentInfo == null)? 0 :this.paymentInfo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Order) == false) {
            return false;
        }
        Order rhs = ((Order) other);
        return ((((((((((((((((((((((((((((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.lastModifiedAt == rhs.lastModifiedAt)||((this.lastModifiedAt!= null)&&this.lastModifiedAt.equals(rhs.lastModifiedAt))))&&((this.orderNumber == rhs.orderNumber)||((this.orderNumber!= null)&&this.orderNumber.equals(rhs.orderNumber))))&&((this.totalPrice == rhs.totalPrice)||((this.totalPrice!= null)&&this.totalPrice.equals(rhs.totalPrice))))&&((this.taxedPrice == rhs.taxedPrice)||((this.taxedPrice!= null)&&this.taxedPrice.equals(rhs.taxedPrice))))&&((this.shippingInfo == rhs.shippingInfo)||((this.shippingInfo!= null)&&this.shippingInfo.equals(rhs.shippingInfo))))&&((this.origin == rhs.origin)||((this.origin!= null)&&this.origin.equals(rhs.origin))))&&((this.refusedGifts == rhs.refusedGifts)||((this.refusedGifts!= null)&&this.refusedGifts.equals(rhs.refusedGifts))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.cart == rhs.cart)||((this.cart!= null)&&this.cart.equals(rhs.cart))))&&((this.orderState == rhs.orderState)||((this.orderState!= null)&&this.orderState.equals(rhs.orderState))))&&((this.inventoryMode == rhs.inventoryMode)||((this.inventoryMode!= null)&&this.inventoryMode.equals(rhs.inventoryMode))))&&((this.returnInfo == rhs.returnInfo)||((this.returnInfo!= null)&&this.returnInfo.equals(rhs.returnInfo))))&&((this.lineItems == rhs.lineItems)||((this.lineItems!= null)&&this.lineItems.equals(rhs.lineItems))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.customLineItems == rhs.customLineItems)||((this.customLineItems!= null)&&this.customLineItems.equals(rhs.customLineItems))))&&((this.itemShippingAddresses == rhs.itemShippingAddresses)||((this.itemShippingAddresses!= null)&&this.itemShippingAddresses.equals(rhs.itemShippingAddresses))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.discountCodes == rhs.discountCodes)||((this.discountCodes!= null)&&this.discountCodes.equals(rhs.discountCodes))))&&((this.lastModifiedBy == rhs.lastModifiedBy)||((this.lastModifiedBy!= null)&&this.lastModifiedBy.equals(rhs.lastModifiedBy))))&&((this.custom == rhs.custom)||((this.custom!= null)&&this.custom.equals(rhs.custom))))&&((this.taxCalculationMode == rhs.taxCalculationMode)||((this.taxCalculationMode!= null)&&this.taxCalculationMode.equals(rhs.taxCalculationMode))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.lastMessageSequenceNumber == rhs.lastMessageSequenceNumber)||((this.lastMessageSequenceNumber!= null)&&this.lastMessageSequenceNumber.equals(rhs.lastMessageSequenceNumber))))&&((this.syncInfo == rhs.syncInfo)||((this.syncInfo!= null)&&this.syncInfo.equals(rhs.syncInfo))))&&((this.taxRoundingMode == rhs.taxRoundingMode)||((this.taxRoundingMode!= null)&&this.taxRoundingMode.equals(rhs.taxRoundingMode))))&&((this.transactionFee == rhs.transactionFee)||((this.transactionFee!= null)&&this.transactionFee.equals(rhs.transactionFee))))&&((this.createdBy == rhs.createdBy)||((this.createdBy!= null)&&this.createdBy.equals(rhs.createdBy))))&&((this.taxMode == rhs.taxMode)||((this.taxMode!= null)&&this.taxMode.equals(rhs.taxMode))))&&((this.shippingAddress == rhs.shippingAddress)||((this.shippingAddress!= null)&&this.shippingAddress.equals(rhs.shippingAddress))))&&((this.billingAddress == rhs.billingAddress)||((this.billingAddress!= null)&&this.billingAddress.equals(rhs.billingAddress))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.paymentInfo == rhs.paymentInfo)||((this.paymentInfo!= null)&&this.paymentInfo.equals(rhs.paymentInfo))));
    }

}
