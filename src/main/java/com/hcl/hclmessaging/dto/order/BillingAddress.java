
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
    "firstName",
    "lastName",
    "streetName",
    "city",
    "state",
    "country",
    "phone",
    "email",
    "additionalAddressInfo"
})
public class BillingAddress {

    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("streetName")
    private String streetName;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("country")
    private String country;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("email")
    private String email;
    @JsonProperty("additionalAddressInfo")
    private String additionalAddressInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("streetName")
    public String getStreetName() {
        return streetName;
    }

    @JsonProperty("streetName")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("additionalAddressInfo")
    public String getAdditionalAddressInfo() {
        return additionalAddressInfo;
    }

    @JsonProperty("additionalAddressInfo")
    public void setAdditionalAddressInfo(String additionalAddressInfo) {
        this.additionalAddressInfo = additionalAddressInfo;
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
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.streetName == null)? 0 :this.streetName.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
        result = ((result* 31)+((this.additionalAddressInfo == null)? 0 :this.additionalAddressInfo.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BillingAddress) == false) {
            return false;
        }
        BillingAddress rhs = ((BillingAddress) other);
        return (((((((((((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.streetName == rhs.streetName)||((this.streetName!= null)&&this.streetName.equals(rhs.streetName))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.phone == rhs.phone)||((this.phone!= null)&&this.phone.equals(rhs.phone))))&&((this.additionalAddressInfo == rhs.additionalAddressInfo)||((this.additionalAddressInfo!= null)&&this.additionalAddressInfo.equals(rhs.additionalAddressInfo))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
