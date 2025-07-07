package com.crayon.service;


import com.crayon.model.TokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TokenCache {

    @Autowired
    TokenService tokenService;

    private static String token;
    private static long expiryTime;


    public synchronized String getToken() {

        if (token == null || System.currentTimeMillis() >= expiryTime) {
            refreshToken();
        }
        return token;

    }

    private  void refreshToken() {

        TokenResponse tokenResponse = fetchTokenFromApi();
        if(tokenResponse==null){
            throw new NullPointerException("Something went wrong here.Null value is received as token.");
        }
        token = tokenResponse.getAccessToken();
        expiryTime = System.currentTimeMillis() + (tokenResponse.getExpiresIn() - 60) * 1000L;
    }

    private TokenResponse fetchTokenFromApi() {

        TokenResponse tokenResponse = tokenService.getAccessToken();
        return tokenResponse;
    }
}

