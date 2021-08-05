
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
    "name",
    "amount",
    "includedInPrice",
    "country",
    "state",
    "subRates"
})
public class TaxRate {

    @JsonProperty("name")
    private String name;
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("includedInPrice")
    private Boolean includedInPrice;
    @JsonProperty("country")
    private String country;
    @JsonProperty("state")
    private String state;
    @JsonProperty("subRates")
    private List<Object> subRates = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("includedInPrice")
    public Boolean getIncludedInPrice() {
        return includedInPrice;
    }

    @JsonProperty("includedInPrice")
    public void setIncludedInPrice(Boolean includedInPrice) {
        this.includedInPrice = includedInPrice;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("subRates")
    public List<Object> getSubRates() {
        return subRates;
    }

    @JsonProperty("subRates")
    public void setSubRates(List<Object> subRates) {
        this.subRates = subRates;
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
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.includedInPrice == null)? 0 :this.includedInPrice.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.subRates == null)? 0 :this.subRates.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaxRate) == false) {
            return false;
        }
        TaxRate rhs = ((TaxRate) other);
        return ((((((((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.includedInPrice == rhs.includedInPrice)||((this.includedInPrice!= null)&&this.includedInPrice.equals(rhs.includedInPrice))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.subRates == rhs.subRates)||((this.subRates!= null)&&this.subRates.equals(rhs.subRates))));
    }

}
