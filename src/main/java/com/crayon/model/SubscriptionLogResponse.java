package com.crayon.model;

import com.crayon.model.duplicates.CustomerTenant;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.time.Instant;
import java.util.List;

@Data
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriptionLogResponse {

    public SubscriptionLogResponse(){

    }

    @JsonProperty("Id")
    private int id;

    @JsonProperty("PublisherSubscriptionId")
    private String publisherSubscriptionId;

    @JsonProperty("Quantity")
    private String quantity;


    @JsonProperty("Name")
    private String name;


    @JsonProperty("Status")
    private String status;


    @JsonProperty("OrderId")
    private String orderId;

    @JsonProperty("Publisher")
    private String publisher;


    @JsonProperty("Organization")
    private String organization;


    @JsonProperty("CustomerTenant")
    private String customerTenant;

    @JsonProperty("Product")
    private String product;

    @JsonProperty("CreationDate")
    private String creationDate;

    @JsonProperty("EffectiveStartDate")
    private String effectiveStartDate;

    @JsonProperty("CommitmentEndDate")
    private String commitmentEndDate;

    @JsonProperty("SuspensionReasons")
    private List<String> suspensionReasons;

    @JsonProperty("AcceptAutoSuspension")
    private boolean acceptAutoSuspension;

    @JsonProperty("AutoSuspensionDate")
    private String autoSuspensionDate;

    @JsonProperty("AvailableAddonsCount")
    private int availableAddonsCount;

    @JsonProperty("AttestationAccepted")
    private boolean attestationAccepted;

    @JsonProperty("TermDuration")
    private String termDuration;

    @JsonProperty("Subscriptions")
    private List<String> subscriptions;

    @JsonProperty("SubscriptionMaxTreshold")
    private int subscriptionMaxTreshold;

    private String action;
    private String trackingId;
    private String source;
    private String type;
    private Instant timestamp;

}
