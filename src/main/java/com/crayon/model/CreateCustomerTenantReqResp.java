package com.crayon.model;

import com.crayon.validator.ValidSource;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

@Data
@ToString
public class CreateCustomerTenantReqResp {


    public CreateCustomerTenantReqResp() {
    }


    private String action;
    private String trackingId;
    private String source;
    private String type;
    private Instant timestamp;
    @JsonProperty("Tenant")
    private String tenant;
    @JsonProperty("Company")
    private String company;
    @JsonProperty("{Profile}")
    private String profile;
    @JsonProperty("User")
    private String user;


}
