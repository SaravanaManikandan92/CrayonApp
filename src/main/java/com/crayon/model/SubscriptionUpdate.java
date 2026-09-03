package com.crayon.model;

import com.crayon.model.duplicates.CustomerTenant;
import com.crayon.model.duplicates.Product;
import com.crayon.validator.ValidSource;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SubscriptionUpdate {


    public SubscriptionUpdate(){

    }


    @ValidSource
    @JsonProperty("source")
    private String source;

    @JsonProperty("tracking_id")
    private String trackingId;

    @JsonProperty("Id")
    private int id;

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
    private String suspensionReasons;

    @JsonProperty("AcceptAutoSuspension")
    private Boolean acceptAutoSuspension;

    @JsonProperty("AutoSuspensionDate")
    private String autoSuspensionDate;

    @JsonProperty("AvailableAddonsCount")
    private int availableAddonsCount;

    @JsonProperty("ProvisionType")
    private int provisionType;

    @JsonProperty("AttestationAccepted")
    private Boolean attestationAccepted;

    @JsonProperty("TermDuration")
    private String termDuration;

    @JsonProperty("Subscriptions")
    private String[] subscriptions;

    @JsonProperty("OriginalAgreementId")
    private String originalAgreementId;

    @JsonProperty("SubscriptionMaxTreshold")
    private int subscriptionMaxTreshold;

    @JsonProperty("PurchasePrice")
    private float purchasePrice;

    @JsonProperty("PurchasePriceCurrency")
    private String purchasePriceCurrency;

    @JsonProperty("InvoiceProfile")
    private String invoiceProfile;

    @JsonProperty("EntitlementId")
    private String entitlementId;

    @JsonProperty("BillingCycle")
    private int billingCycle;

    @JsonProperty("Markup")
    private float markUp;

    @JsonProperty("IsTrial")
    private boolean isTrial;

    @JsonProperty("StartDate")
    private String startDate;

    @JsonProperty("EndDate")
    private String endDate;

    @JsonProperty("PriceType")
    private int priceType;

    @JsonProperty("SalesPrice")
    private float salesPrice;

    @JsonProperty("RegisteredForReservedInstance")
    private boolean registeredForReservedInstance;


    @JsonProperty("SubscriptionTags")
    private String subscriptionTags;

    @JsonProperty("PartNumber")
    private String partNumber;


    @JsonProperty("AutoRenewEnabled")
    private boolean autoRenewEnabled;


    @JsonProperty("CancellationAllowedUntilDate")
    private String cancellationAllowedUntilDate;

    @JsonProperty("ScheduledNextTermInstructions")
    private String scheduledNextTermInstructions;

    @JsonProperty("MaxEndCustomerQuantity")
    private String maxEndCustomerQuantity;

    @JsonProperty("RenewalType")
    private String renewalType;

    @JsonProperty("RenewalEffectiveDate")
    private String renewalEffectiveDate;



}
