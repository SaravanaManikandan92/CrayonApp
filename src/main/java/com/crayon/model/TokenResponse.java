package com.crayon.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class TokenResponse {
     public TokenResponse()
     {}
     @JsonProperty("source")
     private String source;

     @JsonProperty("AccessToken")
     private String accessToken;

     @JsonProperty("IdentityToken")
     private String identityToken;

     @JsonProperty("Error")
     private String error;

     @JsonProperty("ExpiresIn")
     private int expiresIn;

     @JsonProperty("TokenType")
     private String tokenType;

     @JsonProperty("RefreshToken")
     private String refreshToken;
}
