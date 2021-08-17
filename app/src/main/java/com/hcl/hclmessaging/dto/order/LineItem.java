
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
    "id",
    "productId",
    "name",
    "productType",
    "variant",
    "price",
    "quantity",
    "discountedPricePerQuantity",
    "distributionChannel",
    "taxRate",
    "addedAt",
    "lastModifiedAt",
    "state",
    "priceMode",
    "totalPrice",
    "taxedPrice",
    "custom",
    "lineItemMode"
})
public class LineItem {

    @JsonProperty("id")
    private String id;
    @JsonProperty("productId")
    private String productId;
    @JsonProperty("name")
    private Map<String, String> name;
    @JsonProperty("productType")
    private ProductType productType;
    @JsonProperty("variant")
    private Variant variant;
    @JsonProperty("price")
    private Price__2 price;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("discountedPricePerQuantity")
    private List<Object> discountedPricePerQuantity = null;
    @JsonProperty("distributionChannel")
    private DistributionChannel distributionChannel;
    @JsonProperty("taxRate")
    private TaxRate taxRate;
    @JsonProperty("addedAt")
    private String addedAt;
    @JsonProperty("lastModifiedAt")
    private String lastModifiedAt;
    @JsonProperty("state")
    private List<State> state = null;
    @JsonProperty("priceMode")
    private String priceMode;
    @JsonProperty("totalPrice")
    private Price totalPrice;
    @JsonProperty("taxedPrice")
    private TaxedPrice taxedPrice;
    @JsonProperty("custom")
    private Custom custom;
    @JsonProperty("lineItemMode")
    private String lineItemMode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("name")
    public Map<String, String> getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Map<String, String> name) {
        this.name = name;
    }

    @JsonProperty("productType")
    public ProductType getProductType() {
        return productType;
    }

    @JsonProperty("productType")
    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @JsonProperty("variant")
    public Variant getVariant() {
        return variant;
    }

    @JsonProperty("variant")
    public void setVariant(Variant variant) {
        this.variant = variant;
    }

    @JsonProperty("price")
    public Price__2 getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price__2 price) {
        this.price = price;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("discountedPricePerQuantity")
    public List<Object> getDiscountedPricePerQuantity() {
        return discountedPricePerQuantity;
    }

    @JsonProperty("discountedPricePerQuantity")
    public void setDiscountedPricePerQuantity(List<Object> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
    }

    @JsonProperty("distributionChannel")
    public DistributionChannel getDistributionChannel() {
        return distributionChannel;
    }

    @JsonProperty("distributionChannel")
    public void setDistributionChannel(DistributionChannel distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    @JsonProperty("taxRate")
    public TaxRate getTaxRate() {
        return taxRate;
    }

    @JsonProperty("taxRate")
    public void setTaxRate(TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    @JsonProperty("addedAt")
    public String getAddedAt() {
        return addedAt;
    }

    @JsonProperty("addedAt")
    public void setAddedAt(String addedAt) {
        this.addedAt = addedAt;
    }

    @JsonProperty("lastModifiedAt")
    public String getLastModifiedAt() {
        return lastModifiedAt;
    }

    @JsonProperty("lastModifiedAt")
    public void setLastModifiedAt(String lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    @JsonProperty("state")
    public List<State> getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(List<State> state) {
        this.state = state;
    }

    @JsonProperty("priceMode")
    public String getPriceMode() {
        return priceMode;
    }

    @JsonProperty("priceMode")
    public void setPriceMode(String priceMode) {
        this.priceMode = priceMode;
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

    @JsonProperty("custom")
    public Custom getCustom() {
        return custom;
    }

    @JsonProperty("custom")
    public void setCustom(Custom custom) {
        this.custom = custom;
    }

    @JsonProperty("lineItemMode")
    public String getLineItemMode() {
        return lineItemMode;
    }

    @JsonProperty("lineItemMode")
    public void setLineItemMode(String lineItemMode) {
        this.lineItemMode = lineItemMode;
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
        result = ((result* 31)+((this.addedAt == null)? 0 :this.addedAt.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.lastModifiedAt == null)? 0 :this.lastModifiedAt.hashCode()));
        result = ((result* 31)+((this.productId == null)? 0 :this.productId.hashCode()));
        result = ((result* 31)+((this.priceMode == null)? 0 :this.priceMode.hashCode()));
        result = ((result* 31)+((this.totalPrice == null)? 0 :this.totalPrice.hashCode()));
        result = ((result* 31)+((this.taxedPrice == null)? 0 :this.taxedPrice.hashCode()));
        result = ((result* 31)+((this.custom == null)? 0 :this.custom.hashCode()));
        result = ((result* 31)+((this.discountedPricePerQuantity == null)? 0 :this.discountedPricePerQuantity.hashCode()));
        result = ((result* 31)+((this.taxRate == null)? 0 :this.taxRate.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.variant == null)? 0 :this.variant.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.distributionChannel == null)? 0 :this.distributionChannel.hashCode()));
        result = ((result* 31)+((this.productType == null)? 0 :this.productType.hashCode()));
        result = ((result* 31)+((this.lineItemMode == null)? 0 :this.lineItemMode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LineItem) == false) {
            return false;
        }
        LineItem rhs = ((LineItem) other);
        return ((((((((((((((((((((this.addedAt == rhs.addedAt)||((this.addedAt!= null)&&this.addedAt.equals(rhs.addedAt)))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.lastModifiedAt == rhs.lastModifiedAt)||((this.lastModifiedAt!= null)&&this.lastModifiedAt.equals(rhs.lastModifiedAt))))&&((this.productId == rhs.productId)||((this.productId!= null)&&this.productId.equals(rhs.productId))))&&((this.priceMode == rhs.priceMode)||((this.priceMode!= null)&&this.priceMode.equals(rhs.priceMode))))&&((this.totalPrice == rhs.totalPrice)||((this.totalPrice!= null)&&this.totalPrice.equals(rhs.totalPrice))))&&((this.taxedPrice == rhs.taxedPrice)||((this.taxedPrice!= null)&&this.taxedPrice.equals(rhs.taxedPrice))))&&((this.custom == rhs.custom)||((this.custom!= null)&&this.custom.equals(rhs.custom))))&&((this.discountedPricePerQuantity == rhs.discountedPricePerQuantity)||((this.discountedPricePerQuantity!= null)&&this.discountedPricePerQuantity.equals(rhs.discountedPricePerQuantity))))&&((this.taxRate == rhs.taxRate)||((this.taxRate!= null)&&this.taxRate.equals(rhs.taxRate))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.variant == rhs.variant)||((this.variant!= null)&&this.variant.equals(rhs.variant))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.distributionChannel == rhs.distributionChannel)||((this.distributionChannel!= null)&&this.distributionChannel.equals(rhs.distributionChannel))))&&((this.productType == rhs.productType)||((this.productType!= null)&&this.productType.equals(rhs.productType))))&&((this.lineItemMode == rhs.lineItemMode)||((this.lineItemMode!= null)&&this.lineItemMode.equals(rhs.lineItemMode))));
    }

}
