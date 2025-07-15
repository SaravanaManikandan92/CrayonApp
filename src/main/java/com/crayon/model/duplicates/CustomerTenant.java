package com.crayon.model.duplicates;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
public class CustomerTenant {

    @JsonProperty("Id")
    private int id;

    @JsonProperty("PublisherCustomerId")
    private String publisherCustomerId;
}
