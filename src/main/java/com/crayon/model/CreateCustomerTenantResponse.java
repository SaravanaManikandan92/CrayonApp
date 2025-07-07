package com.crayon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class CreateCustomerTenantResponse {

    public CreateCustomerTenantResponse() {
    }

    @JsonProperty("tracking_id")
    private String trackingId;

    @JsonProperty("source")
    private String source;

    @JsonProperty("Tenant")
    private Tenant tenant;
    @JsonProperty("User")
    private User user;
    @JsonProperty("Profile")
    private Profile profile;
    @JsonProperty("Company")
    private Company company;


}
