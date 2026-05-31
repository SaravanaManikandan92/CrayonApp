package com.crayon.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListOfSubscriptionResponse {

    @JsonProperty("Items")
    private List<SubscriptionResponse> subscriptionResponseList;

    @JsonProperty("TotalHits")
    private Integer  totalHits;

}
