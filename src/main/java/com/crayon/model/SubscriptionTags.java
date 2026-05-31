package com.crayon.model;


import com.crayon.model.duplicates.CustomerTenant;
import com.crayon.model.duplicates.Product;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubscriptionTags {
    @JsonProperty("SubscriptionId")
    private Integer subscriptionId;

    @JsonProperty("Department")
    private String department;

    @JsonProperty("CostCenter")
    private String costCenter;

    @JsonProperty("Project")
    private String project;

    @JsonProperty("Owner")
    private String owner;

    @JsonProperty("Custom")
    private String custom;

    @JsonProperty("CreatedDate")
    private String createdDate;

    @JsonProperty("ModifiedDate")
    private String modifiedDate;
}
