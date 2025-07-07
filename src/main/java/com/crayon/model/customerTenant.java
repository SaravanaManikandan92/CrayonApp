package com.crayon.model;

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
public class customerTenant {

    @NotBlank(message="Id should not be null")
    @JsonProperty("id")
    private String id;
}
