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
public class Profile {
    public Profile()
    {}


    @JsonProperty("CultureCode")
    private String cultureCode;

    @JsonProperty("LanguageCode")
    private String languageCode;

    @NotBlank(message="Contact should not be null")
    @JsonProperty("Contact")
    private Contact contact;

    @NotBlank(message="Address should not be null")
    @JsonProperty("Address")
    private Address address;

}
