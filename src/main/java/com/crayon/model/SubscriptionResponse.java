package com.crayon.model;

import com.crayon.model.duplicates.CustomerTenant;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.util.List;


@Data
@ToString
public class SubscriptionResponse {

    public SubscriptionResponse(){

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
    private Publisher publisher;


    @JsonProperty("Organization")
    private Organization organization;


    @JsonProperty("CustomerTenant")
    private CustomerTenant customerTenant;

    @JsonProperty("Product")
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

    @JsonProperty("SubscriptionMaxTreshold")
    private int subscriptionMaxTreshold;

}
