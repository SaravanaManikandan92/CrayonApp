package com.crayon.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
public class Contact {


    public Contact()
    {}

    @NotBlank(message="FirstName should not be null")
    @JsonProperty("FirstName")
    private String firstName;

    @NotBlank(message="LastName should not be null")
    @JsonProperty("LastName")
    private String lastName;

    @NotBlank(message="Email should not be null")
    @JsonProperty("Email")
    private String email;

    @NotBlank(message="PhoneNumber should not be null")
    @JsonProperty("PhoneNumber")
    private String phoneNumber;
}
