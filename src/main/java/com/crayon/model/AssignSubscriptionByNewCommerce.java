package com.crayon.model;

import com.crayon.validator.ValidSource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssignSubscriptionByNewCommerce {

    public AssignSubscriptionByNewCommerce(){}

    @ValidSource
    @JsonProperty("source")
    private String source;

    @JsonProperty("tracking_id")
    private String trackingId;

    @JsonProperty("customerTenantId")
    private int customerTenantId;

    @JsonProperty("billingCycle")
    private int billingCycle;

    @JsonProperty("partNumber")
    private String partNumber;

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("termDuration")
    private String termDuration;

    @JsonProperty("customTermEndDate")
    private String customTermEndDate;

    @JsonProperty("scheduledDate")
    private String scheduledDate;



}
