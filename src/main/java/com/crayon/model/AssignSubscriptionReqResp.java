package com.crayon.model;


import com.crayon.model.duplicates.CustomerTenant;
import com.crayon.model.duplicates.Product;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;
import java.util.List;

@Data
@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssignSubscriptionReqResp {

    public AssignSubscriptionReqResp(){}

    private String action;

    private String source;

    private String trackingId;

    private String type;

    @JsonProperty("Id")
    private String id;


    @JsonProperty("PublisherSubscriptionId")
    private String publisherSubscriptionId;


    @JsonProperty("Quantity")
    private int quantity;

    @JsonProperty("Name")
    private String name;


    @JsonProperty("Status")
    private int status;


    @JsonProperty("OrderId")
    private String orderId;

    private Publisher publisher;

    private Organization organization;

    private CustomerTenant customerTenant;

    private Product product;

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

    @JsonProperty("SubscriptionMaxThreshold")
    private int subscriptionMaxThreshold;

    private Instant timestamp;


}
