package com.crayon.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
public class Tenant {
    public Tenant() {
    }

    @JsonProperty("Id")
    private String id;

    @NotBlank(message =  "Name is required")
    @JsonProperty("Name")
    private String name;

    @NotNull(message =  "Publisher is required")
    @Valid
    @JsonProperty("Publisher")
    Publisher publisher;


    @JsonProperty("PublisherCustomerId")
    private String publisherCustomerId;


    @JsonProperty("ExternalPublisherCustomerId")
    private String externalPublisherCustomerId;

    @NotNull(message =  "DomainPrefix is required")
    @Valid
    @JsonProperty("DomainPrefix")
    private String domainPrefix;

    @JsonProperty("Reference")
    private String reference;

    @NotNull(message =  "CustomerTenantType is required")
    @Valid
    @JsonProperty("CustomerTenantType")
    private int customerTenantType;

    @JsonProperty("EntityStatus")
    private String entityStatus;

    @NotNull(message =  "Organization is required")
    @Valid
    @JsonProperty("Organization")
    Organization organization;

    @NotNull(message =  "InvoiceProfile is required")
    @Valid
    @JsonProperty("InvoiceProfile")
    InvoiceProfile invoiceProfile;

}
