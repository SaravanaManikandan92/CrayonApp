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


@Data
@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssignedSubscriptionResponse {



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

    @JsonProperty("AttestationAccepted")
    private Boolean attestationAccepted;

    @JsonProperty("TermDuration")
    private String termDuration;

    @JsonProperty("Subscriptions")
    private String[] subscriptions;

    @JsonProperty("SubscriptionMaxTreshold")
    private int subscriptionMaxThreshold;

    @JsonProperty("OriginalAgreementId")
    private String originalAgreementId;

    @JsonProperty("PurchasePrice")
    private float purchasePrice;

    @JsonProperty("PurchasePriceCurrency")
    private String purchasePriceCurrency;

    @JsonProperty("InvoiceProfile")
    private String invoiceProfile;

    @JsonProperty("EntitlementId")
    private String entitlementId;

    @JsonProperty("provisionType")
    private int ProvisionType;

    @JsonProperty("BillingCycle")
    private int billingCycle;

    @JsonProperty("IsTrial")
    private Boolean isTrial;

    @JsonProperty("Markup")
    private float markup;

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

    @JsonProperty("ScheduledNextTermInstructions")
    private String scheduledNextTermInstructions;

    @JsonProperty("PriceType")
    private int priceType;

    @JsonProperty("SalesPrice")
    private float salesPrice;

    @JsonProperty("RegisteredForReservedInstance")
    private Boolean registeredForReservedInstance;

    @JsonProperty("AutoRenewEnabled")
    private Boolean autoRenewEnabled;

    @JsonProperty("MaxEndCustomerQuantity")
    private String maxEndCustomerQuantity;

    private Instant timestamp;

    @JsonProperty("source")
    private String source;

    @JsonProperty("tracking_id")
    private String trackingId;

}
