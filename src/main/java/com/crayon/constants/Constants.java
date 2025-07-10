package com.crayon.constants;

import java.util.Arrays;
import java.util.List;

public class Constants {


    public static List<String> clientList = Arrays.asList("Magically_Genius","Outbox_Labs","MicroSaaS_Labs","Cheap_Inbox");
   // public static String INFLUX_TOKEN ="Token Kq7seBQiRWyqbkF4DYe5mH-6FkVoyW6xTXF5LzGsBihqTpkULkXBfLhYhtyyBA9tdgTN3SPrDeitO6on-_cEdA==";//"Token A7MJiqEvG-3B-n5geDnVWQ_61KnpWbLpueTPywlr7PrsX19YTqXyikVuTnjnshDOEVv9-1wUa7XSMbSnxjm0Tw==";
    public static String INFLUX_TOKEN ="my-super-token";//;"Kq7seBQiRWyqbkF4DYe5mH-6FkVoyW6xTXF5LzGsBihqTpkULkXBfLhYhtyyBA9tdgTN3SPrDeitO6on-_cEdA==";
    public static String INFLUX_ORG ="AxelOrg";//"f086a9856ff86826" //SaraOrg
    public static String INFLUX_BUCKET ="CrayonAudit";
    public static String INFLUX_URL ="http://localhost:8086";
    public static String INFLUX_URL_QUERY ="http://localhost:8086/api/v2/query";
    public static String INFLUX_URL_WRITE ="http://localhost:8086/api/v2/write";

    public static int ORGANIZATION_ID=4045755;
    public static int PUBLISHER_ID=2;
    public static int Magically_Genius_INVOICE_ID=207443;
    public static int Outbox_Labs_INVOICE_ID=180723;

    public static int MicroSaaS_Labs_INVOICE_ID=211425;
    public static int Cheap_Inbox_INVOICE_ID=212451;

    public enum ClientDetails {

        CLIENT_ID("CLIENT_ID", "bd131176-82c8-49cf-9c01-387d7ae11a80"),
        CLIENT_SECRET("CLIENT_SECRET", "cbebba0a-d33f-4957-a796-d90c6ab06e81"),
        USER_NAME("USER_NAME", "rsvp@axalingroup.com"),
        PASS_WORD("PASS_WORD", "Axalingroup@2025"),
        GRANT_TYPE("","password"),
        SCOPE("","CustomerApi"),
        CRAYON_TOKEN_API_URL("CRAYON_TOKEN_API_URL", "https://api.crayon.com/api/v1/connect/token"),
        CRAYON_TOKEN_CREATE_TENANT_API_URL("CRAYON_TOKEN_CREATE_TENANT_API_URL","https://api.crayon.com/api/v1/customertenants/"),
        CRAYON_TOKEN_CONSENT_AGREEMENT_URL("","https://api.crayon.com/api/v1/customertenants/{id}/agreements"),
        CRAYON_TOKEN_ASSIGN_AGREEMENT_URL("","https://api.crayon.com/api/v1/subscriptions/"),
        CRAYON_TOKEN_ASSIGN_AGREEMENT_BY_NEW_COMMERCE_URL("","https://api.crayon.com/api/v1/subscriptions/new-commerce-orders"),
        CRAYON_GET_TENANT_BY_ID("","https://api.crayon.com/api/v1/customertenants/"),
        CRAYON_GET_SUBSCRIPTION_BY_ID("","https://api.crayon.com/api/v1/subscriptions/")
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
