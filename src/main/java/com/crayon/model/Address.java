package com.crayon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Data
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {

    public Address()
    {}

    @NotBlank(message="FirstName should not be null")
    @JsonProperty("FirstName")
    private String firstName;

    @NotBlank(message="LastName should not be null")
    @JsonProperty("LastName")
    private String lastName;

    @JsonProperty("MiddleName")
    private String middlename;

    @NotBlank(message="AddressLine1 should not be null")
    @JsonProperty("AddressLine1")
    private String addressline1;

    @JsonProperty("AddressLine2")
    private String addressline2;

    @JsonProperty("AddressLine3")
    private String addressline3;

    @NotBlank(message="City should not be null")
    @JsonProperty("City")
    private String city;

    @NotBlank(message="Region should not be null")
    @JsonProperty("Region")
    private String region;


    @NotBlank(message="PostalCode should not be null")
    @JsonProperty("PostalCode")
    private String postalCode;

    @NotBlank(message="CountryCode should not be null")
    @JsonProperty("CountryCode")
    private String countryCode;

    @JsonProperty("CountryName")
    private String countryName;

}
