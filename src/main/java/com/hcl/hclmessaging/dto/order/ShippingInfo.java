
package com.hcl.hclmessaging.dto.order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "shippingMethodName",
    "price",
    "shippingRate",
    "taxRate",
    "deliveries",
    "shippingMethod",
    "taxedPrice",
    "shippingMethodState"
})
public class ShippingInfo {

    @JsonProperty("shippingMethodName")
    private String shippingMethodName;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("shippingRate")
    private ShippingRate shippingRate;
    @JsonProperty("taxRate")
    private TaxRate taxRate;
    @JsonProperty("deliveries")
    private List<Object> deliveries = null;
    @JsonProperty("shippingMethod")
    private ShippingMethod shippingMethod;
    @JsonProperty("taxedPrice")
    private TaxedPrice taxedPrice;
    @JsonProperty("shippingMethodState")
    private String shippingMethodState;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shippingMethodName")
    public String getShippingMethodName() {
        return shippingMethodName;
    }

    @JsonProperty("shippingMethodName")
    public void setShippingMethodName(String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("shippingRate")
    public ShippingRate getShippingRate() {
        return shippingRate;
    }

    @JsonProperty("shippingRate")
    public void setShippingRate(ShippingRate shippingRate) {
        this.shippingRate = shippingRate;
    }

    @JsonProperty("taxRate")
    public TaxRate getTaxRate() {
        return taxRate;
    }

    @JsonProperty("taxRate")
    public void setTaxRate(TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    @JsonProperty("deliveries")
    public List<Object> getDeliveries() {
        return deliveries;
    }

    @JsonProperty("deliveries")
    public void setDeliveries(List<Object> deliveries) {
        this.deliveries = deliveries;
    }

    @JsonProperty("shippingMethod")
    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    @JsonProperty("shippingMethod")
    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    @JsonProperty("taxedPrice")
    public TaxedPrice getTaxedPrice() {
        return taxedPrice;
    }

    @JsonProperty("taxedPrice")
    public void setTaxedPrice(TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    @JsonProperty("shippingMethodState")
    public String getShippingMethodState() {
        return shippingMethodState;
    }

    @JsonProperty("shippingMethodState")
    public void setShippingMethodState(String shippingMethodState) {
        this.shippingMethodState = shippingMethodState;
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
        result = ((result* 31)+((this.shippingRate == null)? 0 :this.shippingRate.hashCode()));
        result = ((result* 31)+((this.taxRate == null)? 0 :this.taxRate.hashCode()));
        result = ((result* 31)+((this.shippingMethodState == null)? 0 :this.shippingMethodState.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.taxedPrice == null)? 0 :this.taxedPrice.hashCode()));
        result = ((result* 31)+((this.shippingMethod == null)? 0 :this.shippingMethod.hashCode()));
        result = ((result* 31)+((this.shippingMethodName == null)? 0 :this.shippingMethodName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.deliveries == null)? 0 :this.deliveries.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShippingInfo) == false) {
            return false;
        }
        ShippingInfo rhs = ((ShippingInfo) other);
        return ((((((((((this.shippingRate == rhs.shippingRate)||((this.shippingRate!= null)&&this.shippingRate.equals(rhs.shippingRate)))&&((this.taxRate == rhs.taxRate)||((this.taxRate!= null)&&this.taxRate.equals(rhs.taxRate))))&&((this.shippingMethodState == rhs.shippingMethodState)||((this.shippingMethodState!= null)&&this.shippingMethodState.equals(rhs.shippingMethodState))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.taxedPrice == rhs.taxedPrice)||((this.taxedPrice!= null)&&this.taxedPrice.equals(rhs.taxedPrice))))&&((this.shippingMethod == rhs.shippingMethod)||((this.shippingMethod!= null)&&this.shippingMethod.equals(rhs.shippingMethod))))&&((this.shippingMethodName == rhs.shippingMethodName)||((this.shippingMethodName!= null)&&this.shippingMethodName.equals(rhs.shippingMethodName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.deliveries == rhs.deliveries)||((this.deliveries!= null)&&this.deliveries.equals(rhs.deliveries))));
    }

}
