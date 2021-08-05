
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
    "price",
    "tiers"
})
public class ShippingRate {

    @JsonProperty("price")
    private Price price;
    @JsonProperty("tiers")
    private List<Object> tiers = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("tiers")
    public List<Object> getTiers() {
        return tiers;
    }

    @JsonProperty("tiers")
    public void setTiers(List<Object> tiers) {
        this.tiers = tiers;
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
        result = ((result* 31)+((this.tiers == null)? 0 :this.tiers.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShippingRate) == false) {
            return false;
        }
        ShippingRate rhs = ((ShippingRate) other);
        return ((((this.tiers == rhs.tiers)||((this.tiers!= null)&&this.tiers.equals(rhs.tiers)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))));
    }

}
