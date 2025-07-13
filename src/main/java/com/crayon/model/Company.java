package com.crayon.model;


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
public class Company {

    public Company()
    {}

    @NotBlank(message="OrganizationRegistrationNumber should not be null")
    @JsonProperty("OrganizationRegistrationNumber")
    private String organizationRegistrationNumber;
}
