
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
    "rate",
    "amount",
    "name"
})
public class TaxPortion {

    @JsonProperty("rate")
    private Integer rate;
    @JsonProperty("amount")
    private Amount amount;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rate")
    public Integer getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    @JsonProperty("amount")
    public Amount getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rate == null)? 0 :this.rate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaxPortion) == false) {
            return false;
        }
        TaxPortion rhs = ((TaxPortion) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rate == rhs.rate)||((this.rate!= null)&&this.rate.equals(rhs.rate))));
    }

}
