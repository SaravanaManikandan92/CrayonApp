package com.crayon.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
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
public class ConsentAgreementReqResp {
    public ConsentAgreementReqResp()
    {}

    private String action;

    private String type;

    private Instant timestamp;

    @JsonProperty("source")
    private String source;

    @JsonProperty("tracking_id")
    private String trackingId;

    @JsonProperty("FirstName")
    private String firstName;

    @JsonProperty("LastName")
    private String lastName;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("PhoneNumber")
    private String phoneNumber;

    @JsonProperty("DateAgreed")
    private String dateAgreed;

    @JsonProperty("AgreementType")
    private int agreementType;

}
