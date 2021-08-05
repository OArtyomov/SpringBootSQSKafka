
package com.hcl.hclmessaging.dto.order;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "currencyCode",
    "centAmount",
    "fractionDigits"
})
public class Value {

    @JsonProperty("type")
    private String type;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("centAmount")
    private Integer centAmount;
    @JsonProperty("fractionDigits")
    private Integer fractionDigits;
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

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("centAmount")
    public Integer getCentAmount() {
        return centAmount;
    }

    @JsonProperty("centAmount")
    public void setCentAmount(Integer centAmount) {
        this.centAmount = centAmount;
    }

    @JsonProperty("fractionDigits")
    public Integer getFractionDigits() {
        return fractionDigits;
    }

    @JsonProperty("fractionDigits")
    public void setFractionDigits(Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
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
        result = ((result* 31)+((this.centAmount == null)? 0 :this.centAmount.hashCode()));
        result = ((result* 31)+((this.fractionDigits == null)? 0 :this.fractionDigits.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.currencyCode == null)? 0 :this.currencyCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Value) == false) {
            return false;
        }
        Value rhs = ((Value) other);
        return ((((((this.centAmount == rhs.centAmount)||((this.centAmount!= null)&&this.centAmount.equals(rhs.centAmount)))&&((this.fractionDigits == rhs.fractionDigits)||((this.fractionDigits!= null)&&this.fractionDigits.equals(rhs.fractionDigits))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.currencyCode == rhs.currencyCode)||((this.currencyCode!= null)&&this.currencyCode.equals(rhs.currencyCode))));
    }

}
