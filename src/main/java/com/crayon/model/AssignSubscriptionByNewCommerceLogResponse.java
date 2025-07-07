package com.crayon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.time.Instant;

@Data
@ToString
public class AssignSubscriptionByNewCommerceLogResponse {

    public AssignSubscriptionByNewCommerceLogResponse(){}

    @JsonProperty("IsSuccessful")
    private boolean IsSuccessful;

    @JsonProperty("ErrorReasonCode")
    private String ErrorReasonCode;

    @JsonProperty("ErrorDescription")
    private String ErrorDescription;

    @JsonProperty("NewCommerceOrderId")
    private String NewCommerceOrderId;

    private String action;
    private String trackingId;
    private String source;
    private String type;
    private Instant timestamp;
}
