package com.crayon.model;

import com.crayon.model.duplicates.CustomerTenant;
import com.crayon.model.duplicates.Product;
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


    @JsonProperty("PriceType")
    private int priceType;

    @JsonProperty("SalesPrice")
    private float salesPrice;

    @JsonProperty("PublisherSubscriptionId")
    private String publisherSubscriptionId;

    @JsonProperty("EntitlementId")
    private String entitlementId;

    @JsonProperty("Quantity")
    private int quantity;


    @JsonProperty("Name")
    private String name;


    @JsonProperty("Status")
    private int status;


    @JsonProperty("OrderId")
    private String orderId;

    @JsonProperty("StartDate")
    private String startDate;

    @JsonProperty("EndDate")
    private String endDate;

    @JsonProperty("SubscriptionTags")
    private String subscriptionTags;

    @JsonProperty("PartNumber")
    private String partNumber;

    @JsonProperty("CancellationAllowedUntilDate")
    private String cancellationAllowedUntilDate;

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

//    @JsonProperty("SuspensionReasons")
//    private List<String> suspensionReasons;

    @JsonProperty("SuspensionReasons")
    private String suspensionReasons;

    @JsonProperty("ScheduledNextTermInstructions")
    private String scheduledNextTermInstructions;

    @JsonProperty("MaxEndCustomerQuantity")
    private String maxEndCustomerQuantity;

    @JsonProperty("OriginalAgreementId")
    private String originalAgreementId;

    @JsonProperty("BillingCycle")
    private int billingCycle;

    @JsonProperty("AcceptAutoSuspension")
    private boolean acceptAutoSuspension;

    @JsonProperty("RegisteredForReservedInstance")
    private boolean registeredForReservedInstance;

    @JsonProperty("AutoRenewEnabled")
    private boolean autoRenewEnabled;

    @JsonProperty("AutoSuspensionDate")
    private String autoSuspensionDate;

    @JsonProperty("AvailableAddonsCount")
    private int availableAddonsCount;

    @JsonProperty("AttestationAccepted")
    private boolean attestationAccepted;

    @JsonProperty("TermDuration")
    private String termDuration;

//    @JsonProperty("Subscriptions")
//    private List<String> subscriptions;

    @JsonProperty("Subscriptions")
    private String[] subscriptions;

    @JsonProperty("SubscriptionMaxTreshold")
    private int subscriptionMaxTreshold;

    @JsonProperty("PurchasePrice")
    private float purchasePrice;

    @JsonProperty("PurchasePriceCurrency")
    private String purchasePriceCurrency;

    @JsonProperty("InvoiceProfile")
    private String invoiceProfile;

    @JsonProperty("ProvisionType")
    private int provisionType;

    @JsonProperty("Markup")
    private float markup;

    @JsonProperty("IsTrial")
    private boolean isTrial;

}
