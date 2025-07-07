package com.crayon.model;

import com.crayon.validator.ValidSource;
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
public class AssignSubscription {



    @ValidSource
    @JsonProperty("source")
    private String source;

    @JsonProperty("tracking_id")
    private String trackingId;

    @NotBlank(message =  "Name is required")
    @JsonProperty("name")
    private String name;

    @NotBlank(message =  "Quantity is required")
    @JsonProperty("quantity")
    private int  quantity;

    @Valid
    @NotNull
    private customerTenant customerTenant;

    @Valid
    @NotNull
    private Product product;

    @NotBlank(message =  "Quantity is required")
    @JsonProperty("billingCycle")
    private int  billingCycle;

    @NotBlank(message =  "TermDuration is required")
    @JsonProperty("termDuration")
    private String  termDuration;

}
