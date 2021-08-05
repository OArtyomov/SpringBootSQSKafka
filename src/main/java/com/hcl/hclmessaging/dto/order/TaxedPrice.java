
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
    "totalNet",
    "totalGross",
    "taxPortions"
})
@Generated("jsonschema2pojo")
public class TaxedPrice {

    @JsonProperty("totalNet")
    private TotalNet totalNet;
    @JsonProperty("totalGross")
    private TotalGross totalGross;
    @JsonProperty("taxPortions")
    private List<TaxPortion> taxPortions = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("totalNet")
    public TotalNet getTotalNet() {
        return totalNet;
    }

    @JsonProperty("totalNet")
    public void setTotalNet(TotalNet totalNet) {
        this.totalNet = totalNet;
    }

    @JsonProperty("totalGross")
    public TotalGross getTotalGross() {
        return totalGross;
    }

    @JsonProperty("totalGross")
    public void setTotalGross(TotalGross totalGross) {
        this.totalGross = totalGross;
    }

    @JsonProperty("taxPortions")
    public List<TaxPortion> getTaxPortions() {
        return taxPortions;
    }

    @JsonProperty("taxPortions")
    public void setTaxPortions(List<TaxPortion> taxPortions) {
        this.taxPortions = taxPortions;
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
        result = ((result* 31)+((this.taxPortions == null)? 0 :this.taxPortions.hashCode()));
        result = ((result* 31)+((this.totalGross == null)? 0 :this.totalGross.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.totalNet == null)? 0 :this.totalNet.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaxedPrice) == false) {
            return false;
        }
        TaxedPrice rhs = ((TaxedPrice) other);
        return (((((this.taxPortions == rhs.taxPortions)||((this.taxPortions!= null)&&this.taxPortions.equals(rhs.taxPortions)))&&((this.totalGross == rhs.totalGross)||((this.totalGross!= null)&&this.totalGross.equals(rhs.totalGross))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.totalNet == rhs.totalNet)||((this.totalNet!= null)&&this.totalNet.equals(rhs.totalNet))));
    }

}
