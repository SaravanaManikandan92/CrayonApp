package com.crayon.service;

import com.crayon.constants.Constants;
import com.crayon.model.TokenResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Component
public class TokenService {

    private static final Logger logger = LoggerFactory.getLogger(TokenService.class);

    @Autowired
    RestTemplate restTemplate;

    public TokenResponse getAccessToken() {
        try {
            String url =  Constants.ClientDetails.CRAYON_BASE_URL.getValue()+Constants.ClientDetails.CRAYON_TOKEN_API_URL.getValue();

            String auth = Constants.ClientDetails.CLIENT_ID.getValue() + ":" + Constants.ClientDetails.CLIENT_SECRET.getValue();
            String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes(StandardCharsets.UTF_8));

            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add("Authorization", "Basic " + encodedAuth);
            httpHeaders.add("Content-Type", "application/x-www-form-urlencoded");


            // Manually build form body as String

            String body = "username=" + URLEncoder.encode(Constants.ClientDetails.USER_NAME.getValue(), StandardCharsets.UTF_8)
                    + "&password=" + URLEncoder.encode(Constants.ClientDetails.PASS_WORD.getValue(), StandardCharsets.UTF_8)
                    + "&grant_type=" + Constants.ClientDetails.GRANT_TYPE.getValue()
                    + "&scope=" + Constants.ClientDetails.SCOPE.getValue();

            HttpEntity<String> request = new HttpEntity<>(body, httpHeaders);

            // Add form parameters

            ResponseEntity<TokenResponse> response = restTemplate.postForEntity(url, request, TokenResponse.class);

            return response.getBody();
        } catch (Exception ex) {
                throw new NullPointerException("Something went wrong here.Null value is received as token. "+ ex.getMessage());
        }

    }


}
