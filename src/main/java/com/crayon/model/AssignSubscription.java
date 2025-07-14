package com.crayon.model;

import com.crayon.validator.ValidSource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Data
@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssignSubscription {



    @ValidSource
    @JsonProperty("source")
    private String source;

    @JsonProperty("tracking_id")
    private String trackingId;

    @NotBlank(message =  "Name is required")
    @JsonProperty("Name")
    private String name;

    @JsonProperty("Quantity")
    private int  quantity;

    @Valid
    @NotNull
    private customerTenant customerTenant;

    @Valid
    @NotNull
    private Product product;

    @JsonProperty("BillingCycle")
    private int  billingCycle;

    @NotBlank(message =  "TermDuration is required")
    @JsonProperty("TermDuration")
    private String  termDuration;

}
