package com.crayon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AssignSubscriptionByNewCommerceResponse {

    public AssignSubscriptionByNewCommerceResponse(){}

    @JsonProperty("IsSuccessful")
    private boolean IsSuccessful;

    @JsonProperty("ErrorReasonCode")
    private String ErrorReasonCode;

    @JsonProperty("ErrorDescription")
    private String ErrorDescription;

    @JsonProperty("NewCommerceOrderId")
    private String NewCommerceOrderId;

    @JsonProperty("tracking_id")
    private String trackingId;

    @JsonProperty("source")
    private String source;

}
