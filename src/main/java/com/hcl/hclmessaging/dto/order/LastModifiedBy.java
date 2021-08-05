
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
    "clientId",
    "isPlatformClient"
})
public class LastModifiedBy {

    @JsonProperty("clientId")
    private String clientId;
    @JsonProperty("isPlatformClient")
    private Boolean isPlatformClient;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @JsonProperty("isPlatformClient")
    public Boolean getIsPlatformClient() {
        return isPlatformClient;
    }

    @JsonProperty("isPlatformClient")
    public void setIsPlatformClient(Boolean isPlatformClient) {
        this.isPlatformClient = isPlatformClient;
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
        result = ((result* 31)+((this.clientId == null)? 0 :this.clientId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.isPlatformClient == null)? 0 :this.isPlatformClient.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LastModifiedBy) == false) {
            return false;
        }
        LastModifiedBy rhs = ((LastModifiedBy) other);
        return ((((this.clientId == rhs.clientId)||((this.clientId!= null)&&this.clientId.equals(rhs.clientId)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.isPlatformClient == rhs.isPlatformClient)||((this.isPlatformClient!= null)&&this.isPlatformClient.equals(rhs.isPlatformClient))));
    }

}
