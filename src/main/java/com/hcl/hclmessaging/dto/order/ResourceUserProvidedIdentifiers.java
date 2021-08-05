
package com.hcl.hclmessaging.dto.order;

import java.util.HashMap;
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
    "orderNumber"
})
public class ResourceUserProvidedIdentifiers {

    @JsonProperty("orderNumber")
    private String orderNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("orderNumber")
    public String getOrderNumber() {
        return orderNumber;
    }

    @JsonProperty("orderNumber")
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
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
        result = ((result* 31)+((this.orderNumber == null)? 0 :this.orderNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceUserProvidedIdentifiers) == false) {
            return false;
        }
        ResourceUserProvidedIdentifiers rhs = ((ResourceUserProvidedIdentifiers) other);
        return (((this.orderNumber == rhs.orderNumber)||((this.orderNumber!= null)&&this.orderNumber.equals(rhs.orderNumber)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
