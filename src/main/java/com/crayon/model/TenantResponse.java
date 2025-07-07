package com.crayon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;

import java.time.Instant;

@Data
@ToString
public class TenantResponse {
    public TenantResponse() {
    }

    private String action;

    private String id;

    private String name;

    private String type;

    @JsonProperty("Tenant")
    String tenant;


    private Instant timestamp;

    @JsonProperty("source")
    private String source;

    @JsonProperty("tracking_id")
    private String trackingId;


}
