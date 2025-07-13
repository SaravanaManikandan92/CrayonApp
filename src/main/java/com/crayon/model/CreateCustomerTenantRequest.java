package com.crayon.model;

import com.crayon.validator.ValidSource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCustomerTenantRequest {

    public CreateCustomerTenantRequest()
    {}


    @ValidSource
    @JsonProperty("source")
    private String source;


    @JsonProperty("tracking_id")
    private String trackingId;


    @JsonProperty("Tenant")
    private Tenant tenant;

    @JsonProperty("Profile")
    private Profile profile;

    @JsonProperty("Company")
    private Company company;
}
