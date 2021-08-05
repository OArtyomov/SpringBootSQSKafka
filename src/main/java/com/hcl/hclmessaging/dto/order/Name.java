
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
    "en-US",
    "en-CA",
    "fr-CA"
})
@Generated("jsonschema2pojo")
public class Name {

    @JsonProperty("en-US")
    private String enUS;
    @JsonProperty("en-CA")
    private String enCA;
    @JsonProperty("fr-CA")
    private String frCA;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("en-US")
    public String getEnUS() {
        return enUS;
    }

    @JsonProperty("en-US")
    public void setEnUS(String enUS) {
        this.enUS = enUS;
    }

    @JsonProperty("en-CA")
    public String getEnCA() {
        return enCA;
    }

    @JsonProperty("en-CA")
    public void setEnCA(String enCA) {
        this.enCA = enCA;
    }

    @JsonProperty("fr-CA")
    public String getFrCA() {
        return frCA;
    }

    @JsonProperty("fr-CA")
    public void setFrCA(String frCA) {
        this.frCA = frCA;
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
        result = ((result* 31)+((this.enUS == null)? 0 :this.enUS.hashCode()));
        result = ((result* 31)+((this.enCA == null)? 0 :this.enCA.hashCode()));
        result = ((result* 31)+((this.frCA == null)? 0 :this.frCA.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Name) == false) {
            return false;
        }
        Name rhs = ((Name) other);
        return (((((this.enUS == rhs.enUS)||((this.enUS!= null)&&this.enUS.equals(rhs.enUS)))&&((this.enCA == rhs.enCA)||((this.enCA!= null)&&this.enCA.equals(rhs.enCA))))&&((this.frCA == rhs.frCA)||((this.frCA!= null)&&this.frCA.equals(rhs.frCA))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
