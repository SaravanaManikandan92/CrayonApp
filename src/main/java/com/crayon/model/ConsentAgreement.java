package com.crayon.model;

import com.crayon.validator.ValidSource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Data
@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsentAgreement {

    public ConsentAgreement()
    {}

    @ValidSource
    @JsonProperty("source")
    private String source;

    @JsonProperty("tracking_id")
    private String trackingId;

    @NotBlank(message="FirstName should not be null")
    @JsonProperty("FirstName")
    private String firstName;

    @NotBlank(message="LastName should not be null")
    @JsonProperty("LastName")
    private String lastName;

    @NotBlank(message="Email should not be null")
    @JsonProperty("Email")
    private String email;

    @JsonProperty("PhoneNumber")
    private String phoneNumber;

    @NotBlank(message="DateAgreed should not be null")
    @JsonProperty("DateAgreed")
    private String dateAgreed;

    @NotBlank(message="AgreementType should not be null")
    @JsonProperty("AgreementType")
    private int agreementType;
}
