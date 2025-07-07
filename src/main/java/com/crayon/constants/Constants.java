package com.crayon.constants;

import java.util.Arrays;
import java.util.List;

public class Constants {


    public static List<String> clientList = Arrays.asList("coke","pepsi");
   // public static String INFLUX_TOKEN ="Token Kq7seBQiRWyqbkF4DYe5mH-6FkVoyW6xTXF5LzGsBihqTpkULkXBfLhYhtyyBA9tdgTN3SPrDeitO6on-_cEdA==";//"Token A7MJiqEvG-3B-n5geDnVWQ_61KnpWbLpueTPywlr7PrsX19YTqXyikVuTnjnshDOEVv9-1wUa7XSMbSnxjm0Tw==";
    public static String INFLUX_TOKEN ="Kq7seBQiRWyqbkF4DYe5mH-6FkVoyW6xTXF5LzGsBihqTpkULkXBfLhYhtyyBA9tdgTN3SPrDeitO6on-_cEdA==";
    public static String INFLUX_ORG ="SaraOrg";//"f086a9856ff86826"
    public static String INFLUX_BUCKET ="CrayonAudit";
    public static String INFLUX_URL ="http://localhost:8086";
    public static String INFLUX_URL_QUERY ="http://localhost:8086/api/v2/query";
    public static String INFLUX_URL_WRITE ="http://localhost:8086/api/v2/write";

    public enum ClientDetails {

        CLIENT_ID("CLIENT_ID", "33731c54-94b6-430b-872f-be0ca64f7bd5"),
        CLIENT_SECRET("CLIENT_SECRET", "03ec3528-ebfb-4ec7-a43d-7b5e06df4b0d"),
        USER_NAME("USER_NAME", "api@testcustomer.com"),
        PASS_WORD("PASS_WORD", "ePLE8129087%"),
        GRANT_TYPE("","password"),
        SCOPE("","CustomerApi"),
        CRAYON_TOKEN_API_URL("CRAYON_TOKEN_API_URL", "https://api.crayon.com/api/v1/connect/token"),
        CRAYON_TOKEN_CREATE_TENANT_API_URL("CRAYON_TOKEN_CREATE_TENANT_API_URL","https://api.crayon.com/api/v1/customertenants/"),
        CRAYON_TOKEN_CONSENT_AGREEMENT_URL("","https://api.crayon.com/api/v1/customertenants/{id}/agreements"),
        CRAYON_TOKEN_ASSIGN_AGREEMENT_URL("","https://api.crayon.com/api/v1/subscriptions/"),
        CRAYON_TOKEN_ASSIGN_AGREEMENT_BY_NEW_COMMERCE_URL("","https://api.crayon.com/api/v1/subscriptions/new-commerce-orders"),
        CRAYON_GET_TENANT_BY_ID("","https://api.crayon.com/api/v1/customertenants/{id}/"),
        CRAYON_GET_SUBSCRIPTION_BY_ID("","https://api.crayon.com/api/v1/subscriptions/{id}/")
        ;


        private String key;
        private String value;

        ClientDetails(final String key, final String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }


}
