package com.crayon.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Data
@Setter
@Getter
@ToString
public class TokenRequest {

    public TokenRequest()
    {}
    private String grant_type;
    private String username;
    private String password;
    private String scope;

}
