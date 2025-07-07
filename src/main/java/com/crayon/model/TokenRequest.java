package com.crayon.model;

import com.crayon.constants.Constants;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.http.NameValuePair;

import java.util.ArrayList;
import java.util.List;

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
