package com.crayon.utility;

import com.crayon.configuration.InfluxDbFactory;
import com.crayon.constants.Constants;
import com.crayon.model.*;
import com.crayon.model.duplicates.CustomerTenant;
import com.crayon.model.duplicates.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.influxdb.client.InfluxDBClient;
import com.influxdb.client.InfluxDBClientFactory;
import com.influxdb.client.QueryApi;
import com.influxdb.client.WriteApi;
import com.influxdb.client.domain.WritePrecision;
import com.influxdb.client.write.Point;
import com.influxdb.query.FluxRecord;
import com.influxdb.query.FluxTable;

import java.time.temporal.ChronoUnit;

import java.time.Instant;
import java.util.*;

public class Utility {

    public static void logHere(CreateCustomerTenantRequest createCustomerTenantRequest, String reqResp,
                               CreateCustomerTenantResponse createCustomerTenantResponse, String exception) {


        InfluxDBClient client = InfluxDbFactory.getInfluxDBClientInstance();
        Point point = Point.measurement("createCustomerTenantReqResp");
        point
                .addTag("source", createCustomerTenantRequest.getSource())
                .addTag("trackingId", createCustomerTenantRequest.getTrackingId())
                .time(System.currentTimeMillis(), WritePrecision.MS);
        point
                .addField("action", "createCustomerTenantRequest");
        if (reqResp.equalsIgnoreCase("request")) {
            point
                    .addField("type", "request")
                    .addField("Tenant", Optional.ofNullable(createCustomerTenantRequest.getTenant())
                            .map(Object::toString)
                            .orElse(null))
                    .addField("Company", Optional.ofNullable(createCustomerTenantRequest.getCompany())
                            .map(Object::toString)
                            .orElse(null))
                    .addField("Profile", Optional.ofNullable(createCustomerTenantRequest.getProfile())
                            .map(Object::toString)
                            .orElse(null));


        } else if (reqResp.equalsIgnoreCase("response")) {
            point

                    .addField("type", "response")
                    .addField("Tenant", Optional.ofNullable(createCustomerTenantResponse.getTenant())
                            .map(Object::toString)
                            .orElse(null))
                    .addField("Company", Optional.ofNullable(createCustomerTenantResponse.getCompany())
                            .map(Object::toString)
                            .orElse(null))
                    .addField("Profile", Optional.ofNullable(createCustomerTenantResponse.getProfile())
                            .map(Object::toString)
                            .orElse(null));
        } else {
            point

                    .addField("type", "exception")
                    .addField("Exception", exception);

        }
        WriteApi writeApi = InfluxDbFactory.getWriteApiInstance();
        writeApi.writePoint(point);

    }

    public static void logHere(String id, ConsentAgreement consentAgreement, String reqResp,
                               String exception) {
        InfluxDBClient client = InfluxDbFactory.getInfluxDBClientInstance();
        Point point = Point.measurement("consentAgreementReqResp");
        point
                .addTag("source", consentAgreement.getSource())
                .addTag("trackingId", consentAgreement.getTrackingId())
                .time(System.currentTimeMillis(), WritePrecision.MS);
        point
                .addField("action", "ConsentAgreement");
        if (reqResp.equalsIgnoreCase("exception")) {
            point
                    .addField("type", "exception")
                    .addField("Exception", exception);

        } else {
            point
                    .addField("firstName", consentAgreement.getFirstName())
                    .addField("lastName", consentAgreement.getLastName())
                    .addField("email", consentAgreement.getEmail())
                    .addField("phoneNumber", consentAgreement.getPhoneNumber())
                    .addField("dateAgreed", consentAgreement.getDateAgreed())
                    .addField("agreementType", consentAgreement.getAgreementType());

            if (reqResp.equalsIgnoreCase("request")) {
                point
                        .addField("type", "request");

            } else if (reqResp.equalsIgnoreCase("response")) {
                point
                        .addField("type", "response");


            }

        }

        WriteApi writeApi = InfluxDbFactory.getWriteApiInstance();
        writeApi.writePoint(point);

    }

    public static void logHere(AssignSubscription assignSubscription, String reqResp,
                               AssignedSubscriptionResponse assignedSubscriptionResponse, String exception) {
        Point point = Point.measurement("assignSubscriptionReqResp");
        point
                .addTag("source", assignSubscription.getSource())
                .addTag("trackingId", assignSubscription.getTrackingId())
                .time(System.currentTimeMillis(), WritePrecision.MS);
        point
                .addField("action", "AssignSubscription");
        if (reqResp.equalsIgnoreCase("request")) {
            point
                    .addField("type", "request")
                    .addField("name", assignSubscription.getName())
                    .addField("quantity", assignSubscription.getQuantity())
                    .addField("customerTenant", Optional.ofNullable(assignSubscription.getCustomerTenant()).map(Object::toString).orElse(null))
                    .addField("product", Optional.ofNullable(assignSubscription.getProduct()).map(Object::toString).orElse(null))
                    .addField("billingCycle", assignSubscription.getBillingCycle())
                    .addField("termDuration", assignSubscription.getTermDuration());


        } else if (reqResp.equalsIgnoreCase("response")) {
            point

                    .addField("type", "response")
                    .addField("id", assignedSubscriptionResponse.getName())
                    .addField("publisherSubscriptionId", assignedSubscriptionResponse.getQuantity())
                    .addField("quantity", Optional.ofNullable(assignedSubscriptionResponse.getCustomerTenant()).map(Object::toString).orElse(null))
                    .addField("name", Optional.ofNullable(assignedSubscriptionResponse.getProduct()).map(Object::toString).orElse(null))
                    .addField("status", assignedSubscriptionResponse.getStatus())
                    .addField("orderId", assignedSubscriptionResponse.getOrderId())
                    .addField("publisher", Optional.ofNullable(assignedSubscriptionResponse.getPublisher())
                            .map(Object::toString)
                            .orElse(null))
                    .addField("organization", Optional.ofNullable(assignedSubscriptionResponse.getOrganization())
                            .map(Object::toString)
                            .orElse(null))
                    .addField("customerTenant", Optional.ofNullable(assignedSubscriptionResponse.getCustomerTenant())
                            .map(Object::toString)
                            .orElse(null))
                    .addField("product", Optional.ofNullable(assignedSubscriptionResponse.getProduct())
                            .map(Object::toString)
                            .orElse(null))
                    .addField("creationDate", assignedSubscriptionResponse.getCreationDate())
                    .addField("effectiveStartDate", assignedSubscriptionResponse.getEffectiveStartDate())
                    .addField("commitmentEndDate", assignedSubscriptionResponse.getCommitmentEndDate());
            int i = 0;
            for (String in : assignedSubscriptionResponse.getSuspensionReasons()) {
                point.addField("suspensionReasons" + i, in);
                i++;

            }

            point.addField("acceptAutoSuspension", assignSubscription.getTermDuration())
                    .addField("autoSuspensionDate", assignSubscription.getTermDuration())
                    .addField("availableAddonsCount", assignSubscription.getTermDuration())
                    .addField("attestationAccepted", assignSubscription.getTermDuration())
                    .addField("termDuration", assignSubscription.getTermDuration())
                    .addField("subscriptions", assignSubscription.getTermDuration())
                    .addField("subscriptionMaxThreshold", assignSubscription.getTermDuration())
            ;

        } else {
            point
                    .addField("type", "exception")
                    .addField("Exception", exception);

        }
        WriteApi writeApi = InfluxDbFactory.getWriteApiInstance();
        writeApi.writePoint(point);

    }

    public static void logHere(AssignSubscriptionByNewCommerce assignSubscription, String reqResp,
                               AssignSubscriptionByNewCommerceResponse assignedSubscriptionResponse, String exception) {
        Point point = Point.measurement("assignSubscriptionNewCommerceReqResp");
        point
                .addTag("source", assignSubscription.getSource())
                .addTag("trackingId", assignSubscription.getTrackingId())
                .time(System.currentTimeMillis(), WritePrecision.MS);
        point
                .addField("action", "AssignSubscriptionByNewCommerce");


        if (reqResp.equalsIgnoreCase("request")) {
            point
                    .addField("type", "request")
                    .addField("customerTenantId", assignSubscription.getCustomerTenantId())
                    .addField("billingCycle", assignSubscription.getBillingCycle())
                    .addField("partNumber", assignSubscription.getPartNumber())
                    .addField("quantity", assignSubscription.getQuantity())
                    .addField("termDuration", assignSubscription.getTermDuration())
                    .addField("customTermEndDate", assignSubscription.getCustomTermEndDate())
                    .addField("scheduledDate", assignSubscription.getScheduledDate());


        } else if (reqResp.equalsIgnoreCase("response")) {
            point
                    .addField("type", "response")
                    .addField("IsSuccessful", assignedSubscriptionResponse.isIsSuccessful())
                    .addField("ErrorReasonCode", assignedSubscriptionResponse.getErrorReasonCode())
                    .addField("ErrorDescription", assignedSubscriptionResponse.getErrorDescription())
                    .addField("NewCommerceOrderId", assignedSubscriptionResponse.getNewCommerceOrderId())

            ;

        } else {
            point
                    .addField("type", "exception")
                    .addField("Exception", exception);

        }
        WriteApi writeApi = InfluxDbFactory.getWriteApiInstance();
        writeApi.writePoint(point);

    }

    public static void logHere(String source, String id, Tenant response, String reqResp,
                               String exception) {
        InfluxDBClient client = InfluxDbFactory.getInfluxDBClientInstance();
        Point point = Point.measurement("getTenantById");
        point
                .addTag("source", source)
                .addTag("trackingId", generateTrackingId(source))
                .time(System.currentTimeMillis(), WritePrecision.MS);
        point
                .addField("action", "GetByTenantId");
        if (reqResp.equalsIgnoreCase("exception")) {
            point
                    .addField("type", "exception")
                    .addField("Exception", exception);

        } else {

            if (reqResp.equalsIgnoreCase("request")) {
                point
                        .addField("id", id)
                        .addField("type", "request");

            } else if (reqResp.equalsIgnoreCase("response")) {
                point
                        .addField("type", "response")
                        .addField("Tenant", Optional.ofNullable(response)
                                .map(Object::toString)
                                .orElse(null));

            }

        }

        WriteApi writeApi = InfluxDbFactory.getWriteApiInstance();
        writeApi.writePoint(point);

    }

    public static void logGetSubscriptionById(String source, String id, SubscriptionResponse response, String reqResp,
                               String exception) {
        InfluxDBClient client = InfluxDbFactory.getInfluxDBClientInstance();
        Point point = Point.measurement("getSubscriptionById");
        point
                .addTag("source", source)
                .addTag("trackingId", generateTrackingId(source))
                .time(System.currentTimeMillis(), WritePrecision.MS);
        point
                .addField("action", "GetSubscriptionById");
        if (reqResp.equalsIgnoreCase("exception")) {
            point
                    .addField("type", "exception")
                    .addField("Exception", exception);

        } else {

            if (reqResp.equalsIgnoreCase("request")) {
                point
                        .addField("id", id)
                        .addField("type", "request");

            } else if (reqResp.equalsIgnoreCase("response")) {

                point
                        .addField("type", "response")
                        .addField("id",response.getId())
                        .addField("publisherSubscriptionId",response.getPublisherSubscriptionId())
                        .addField("quantity",response.getQuantity())
                        .addField("name",response.getName()) //
                        .addField("status",response.getStatus()) //
                        .addField("orderId",response.getOrderId())
                        .addField("publisher",Optional.ofNullable(response.getPublisher())
                                .map(Object::toString)
                                .orElse(null))
                        .addField("organization",Optional.ofNullable(response.getOrganization())
                                .map(Object::toString)
                                .orElse(null))
                        .addField("customerTenant",Optional.ofNullable(response.getCustomerTenant())
                                .map(Object::toString)
                                .orElse(null))
                        .addField("product",Optional.ofNullable(response.getProduct())
                                .map(Object::toString)
                                .orElse(null))
                        .addField("creationDate",response.getCreationDate())
                        .addField("effectiveStartDate",response.getEffectiveStartDate())
                        .addField("commitmentEndDate",response.getCommitmentEndDate())
                        .addField("acceptAutoSuspension",response.isAcceptAutoSuspension())
                        .addField("autoSuspensionDate",response.getAutoSuspensionDate())
                        .addField("availableAddonsCount",response.getAvailableAddonsCount())
                        .addField("attestationAccepted",response.isAttestationAccepted())
                        .addField("termDuration",response.getTermDuration())
                        .addField("subscriptionMaxTreshold",response.getSubscriptionMaxTreshold())
                ;

                int i=0,j= 0;
                for (String in : response.getSuspensionReasons()) {
                    point.addField("suspensionReasons" + i, in);
                    i++;

                }
                for (String in : response.getSubscriptions()) {
                    point.addField("subscriptions" + j, in);
                    j++;

                }


            }

        }

        WriteApi writeApi = InfluxDbFactory.getWriteApiInstance();
        writeApi.writePoint(point);

    }


    public static List<CreateCustomerTenantReqResp> getBySourceInCreateCustomerTenantReqResp(String source, String trackingId) {


        InfluxDBClient client = InfluxDbFactory.getInfluxDBClientInstance();// InfluxDBClientFactory.create(Constants.INFLUX_URL, Constants.INFLUX_TOKEN.toCharArray());
        Point point = null;
        String flux = "from(bucket: \"" + Constants.INFLUX_BUCKET + "\")\n" +
                "  |> range(start: -365d)\n" +
                "  |> filter(fn: (r) => r._measurement == \"createCustomerTenantReqResp\")\n" +
                "  |> filter(fn: (r) => r.source == \"" + source + "\")";
        if (trackingId != null) {
            flux = flux +
                    "  |> filter(fn: (r) => r.trackingId == \"" + trackingId + "\")"
            ;
        }

        QueryApi queryApi = InfluxDbFactory.getQueryApiInstance();
        List<FluxTable> tables = queryApi.query(flux, Constants.INFLUX_ORG);

        Map<Instant, CreateCustomerTenantReqResp> grouped = new HashMap<>();

        for (FluxTable table : tables) {
            for (FluxRecord record : table.getRecords()) {
                Instant time = record.getTime();
                CreateCustomerTenantReqResp resp = grouped.getOrDefault(time, new CreateCustomerTenantReqResp());

                resp.setTimestamp(time);

                // Tags
                Map<String, Object> tags = record.getValues();
                if (tags.containsKey("trackingId")) resp.setTrackingId((String) tags.get("trackingId"));
                if (tags.containsKey("source")) resp.setSource((String) tags.get("source"));

                // Fields
                switch (record.getField()) {
                    case "action" -> resp.setAction((String) record.getValue());
                    case "type" -> resp.setType((String) record.getValue());
                    case "Tenant" -> resp.setTenant((String) record.getValue());
                    case "Company" -> resp.setCompany((String) record.getValue());
                    case "Profile" -> resp.setProfile((String) record.getValue());
                }

                grouped.put(time, resp);
            }
        }

        return new ArrayList<>(grouped.values());
    }


    public static List<ConsentAgreementReqResp> getBySourceInConsentAgreementReqResp(String source, String trackingId) {


        InfluxDBClient client = InfluxDbFactory.getInfluxDBClientInstance();// InfluxDBClientFactory.create(Constants.INFLUX_URL, Constants.INFLUX_TOKEN.toCharArray());
        Point point = null;
        String flux = "from(bucket: \"" + Constants.INFLUX_BUCKET + "\")\n" +
                "  |> range(start: -365d)\n" +
                "  |> filter(fn: (r) => r._measurement == \"consentAgreementReqResp\")\n" +
                "  |> filter(fn: (r) => r.source == \"" + source + "\")";
        if (trackingId != null) {
            flux = flux +
                    "  |> filter(fn: (r) => r.trackingId == \"" + trackingId + "\")";
        }
        QueryApi queryApi = InfluxDbFactory.getQueryApiInstance();
        List<FluxTable> tables = queryApi.query(flux, Constants.INFLUX_ORG);

        Map<Instant, ConsentAgreementReqResp> grouped = new HashMap<>();

        for (FluxTable table : tables) {
            for (FluxRecord record : table.getRecords()) {
                Instant time = record.getTime();
                ConsentAgreementReqResp resp = grouped.getOrDefault(time, new ConsentAgreementReqResp());

                resp.setTimestamp(time);

                // Tags
                Map<String, Object> tags = record.getValues();
                if (tags.containsKey("trackingId")) resp.setTrackingId((String) tags.get("trackingId"));
                if (tags.containsKey("source")) resp.setSource((String) tags.get("source"));

                // Fields
                switch (record.getField()) {
                    case "action" -> resp.setAction((String) record.getValue());
                    case "type" -> resp.setType((String) record.getValue());
                    case "firstName" -> resp.setFirstName((String) record.getValue());
                    case "lastName" -> resp.setLastName((String) record.getValue());
                    case "email" -> resp.setEmail((String) record.getValue());
                    case "phoneNumber" -> resp.setPhoneNumber((String) record.getValue());
                    case "dateAgreed" -> resp.setDateAgreed((String) record.getValue());
                    case "agreementType" -> resp.setAgreementType((Integer) record.getValue());
                }

                grouped.put(time, resp);
            }
        }

        return new ArrayList<>(grouped.values());
    }


    public static List<AssignSubscriptionReqResp> getBySourceInAssignSubscriptionReqResp(String source, String trackingId) {


        InfluxDBClient client = InfluxDbFactory.getInfluxDBClientInstance();// InfluxDBClientFactory.create(Constants.INFLUX_URL, Constants.INFLUX_TOKEN.toCharArray());
        Point point = null;
        String flux = "from(bucket: \"" + Constants.INFLUX_BUCKET + "\")\n" +
                "  |> range(start: -365d)\n" +
                "  |> filter(fn: (r) => r._measurement == \"assignSubscriptionReqResp\")\n" +
                "  |> filter(fn: (r) => r.source == \"" + source + "\")";
        if (trackingId != null) {
            flux = flux +
                    "  |> filter(fn: (r) => r.trackingId == \"" + trackingId + "\")"
            ;
        }

        QueryApi queryApi = InfluxDbFactory.getQueryApiInstance();
        List<FluxTable> tables = queryApi.query(flux, Constants.INFLUX_ORG);

        Map<Instant, AssignSubscriptionReqResp> grouped = new HashMap<>();

        for (FluxTable table : tables) {
            for (FluxRecord record : table.getRecords()) {
                Instant time = record.getTime();
                AssignSubscriptionReqResp resp = grouped.getOrDefault(time, new AssignSubscriptionReqResp());

                resp.setTimestamp(time);

                // Tags
                Map<String, Object> tags = record.getValues();
                if (tags.containsKey("trackingId")) resp.setTrackingId((String) tags.get("trackingId"));
                if (tags.containsKey("source")) resp.setSource((String) tags.get("source"));


                // Fields
                switch (record.getField()) {
                    case "action" -> resp.setAction((String) record.getValue());
                    case "type" -> resp.setType((String) record.getValue());
                    case "id" -> resp.setId((String) record.getValue());
                    case "publisherSubscriptionId" -> resp.setPublisherSubscriptionId((String) record.getValue());
                    case "quantity" -> resp.setQuantity((Integer) record.getValue());
                    case "name" -> resp.setName((String) record.getValue());
                    case "status" -> resp.setStatus((Integer) record.getValue());
                    case "orderId" -> resp.setOrderId((String) record.getValue());
                    case "publisher" -> resp.setPublisher((Publisher) record.getValue());
                    case "organization" -> resp.setOrganization((Organization) record.getValue());
                    case "customerTenant" -> resp.setCustomerTenant((CustomerTenant) record.getValue());
                    case "product" -> resp.setProduct((Product) record.getValue());
                    case "creationDate" -> resp.setCreationDate((String) record.getValue());
                    case "effectiveStartDate" -> resp.setEffectiveStartDate((String) record.getValue());
                    case "commitmentEndDate" -> resp.setCommitmentEndDate((String) record.getValue());
                    case "suspensionReasons1" -> resp.setSuspensionReasons((List<String>) record.getValue());
                    case "acceptAutoSuspension" -> resp.setAcceptAutoSuspension((Boolean) record.getValue());
                    case "autoSuspensionDate" -> resp.setAutoSuspensionDate((String) record.getValue());
                    case "availableAddonsCount" -> resp.setAvailableAddonsCount((Integer) record.getValue());
                    case "attestationAccepted" -> resp.setAttestationAccepted((Boolean) record.getValue());
                    case "termDuration" -> resp.setTermDuration((String) record.getValue());
                    case "subscriptions" -> resp.setSubscriptions((List<String>) record.getValue());
                    case "subscriptionMaxThreshold" -> resp.setSubscriptionMaxThreshold((Integer) record.getValue());
                }

                grouped.put(time, resp);
            }
        }

        return new ArrayList<>(grouped.values());
    }

    public static List<AssignSubscriptionByNewCommerceLogResponse> getBySourceInAssignSubscriptionNewCommerceReqResp(String source, String trackingId) {
        InfluxDBClient client = InfluxDbFactory.getInfluxDBClientInstance();// InfluxDBClientFactory.create(Constants.INFLUX_URL, Constants.INFLUX_TOKEN.toCharArray());
        Point point = null;
        String flux = "from(bucket: \"" + Constants.INFLUX_BUCKET + "\")\n" +
                "  |> range(start: -365d)\n" +
                "  |> filter(fn: (r) => r._measurement == \"assignSubscriptionNewCommerceReqResp\")\n" +
                "  |> filter(fn: (r) => r.source == \"" + source + "\")";
        if (trackingId != null) {
            flux = flux +
                    "  |> filter(fn: (r) => r.trackingId == \"" + trackingId + "\")"
            ;
        }

        QueryApi queryApi = InfluxDbFactory.getQueryApiInstance();
        List<FluxTable> tables = queryApi.query(flux, Constants.INFLUX_ORG);

        Map<Instant, AssignSubscriptionByNewCommerceLogResponse> grouped = new HashMap<>();

        for (FluxTable table : tables) {
            for (FluxRecord record : table.getRecords()) {
                Instant time = record.getTime();
                AssignSubscriptionByNewCommerceLogResponse resp = grouped.getOrDefault(time, new AssignSubscriptionByNewCommerceLogResponse());

                resp.setTimestamp(time);

                // Tags
                Map<String, Object> tags = record.getValues();
                if (tags.containsKey("trackingId")) resp.setTrackingId((String) tags.get("trackingId"));
                if (tags.containsKey("source")) resp.setSource((String) tags.get("source"));


                // Fields
                switch (record.getField()) {
                    case "action" -> resp.setAction((String) record.getValue());
                    case "type" -> resp.setType((String) record.getValue());
                    case "IsSuccessful" -> resp.setIsSuccessful((Boolean) record.getValue());
                    case "ErrorReasonCode" -> resp.setErrorReasonCode((String) record.getValue());
                    case "ErrorDescription" -> resp.setErrorDescription((String) record.getValue());
                    case "NewCommerceOrderId" -> resp.setNewCommerceOrderId((String) record.getValue());
                }

                grouped.put(time, resp);
            }
        }

        return new ArrayList<>(grouped.values());
    }

    public static List<TenantResponse> getBySourceInGetByTenantId(String source, String trackingId) {
        InfluxDBClient client = InfluxDbFactory.getInfluxDBClientInstance();// InfluxDBClientFactory.create(Constants.INFLUX_URL, Constants.INFLUX_TOKEN.toCharArray());
        Point point = null;
        String flux = "from(bucket: \"" + Constants.INFLUX_BUCKET + "\")\n" +
                "  |> range(start: -365d)\n" +
                "  |> filter(fn: (r) => r._measurement == \"getTenantById\")\n" +
                "  |> filter(fn: (r) => r.source == \"" + source + "\")";
        if (trackingId != null) {
            flux = flux +
                    "  |> filter(fn: (r) => r.trackingId == \"" + trackingId + "\")"
            ;
        }

        QueryApi queryApi = InfluxDbFactory.getQueryApiInstance();
        List<FluxTable> tables = queryApi.query(flux, Constants.INFLUX_ORG);

        Map<Instant, TenantResponse> grouped = new HashMap<>();

        for (FluxTable table : tables) {
            for (FluxRecord record : table.getRecords()) {
                Instant time = record.getTime();
                TenantResponse resp = grouped.getOrDefault(time, new TenantResponse());

                resp.setTimestamp(time);

                // Tags
                Map<String, Object> tags = record.getValues();
                if (tags.containsKey("trackingId")) resp.setTrackingId((String) tags.get("trackingId"));
                if (tags.containsKey("source")) resp.setSource((String) tags.get("source"));


                // Fields
                switch (record.getField()) {
                    case "action" -> resp.setAction((String) record.getValue());
                    case "type" -> resp.setType((String) record.getValue());
                    case "id" -> resp.setId((String) record.getValue());
                    case "Tenant" -> resp.setTenant((String) record.getValue());
                }

                grouped.put(time, resp);
            }
        }

        return new ArrayList<>(grouped.values());
    }

    public static List<SubscriptionLogResponse> getBySourceInGetBySubscriptionId(String source, String trackingId) {
        InfluxDBClient client = InfluxDbFactory.getInfluxDBClientInstance();// InfluxDBClientFactory.create(Constants.INFLUX_URL, Constants.INFLUX_TOKEN.toCharArray());
        Point point = null;
        String flux = "from(bucket: \"" + Constants.INFLUX_BUCKET + "\")\n" +
                "  |> range(start: -365d)\n" +
                "  |> filter(fn: (r) => r._measurement == \"getSubscriptionById\")\n" +
                "  |> filter(fn: (r) => r.source == \"" + source + "\")";
        if (trackingId != null) {
            flux = flux +
                    "  |> filter(fn: (r) => r.trackingId == \"" + trackingId + "\")"
            ;
        }

        QueryApi queryApi = InfluxDbFactory.getQueryApiInstance();
        List<FluxTable> tables = queryApi.query(flux, Constants.INFLUX_ORG);

        Map<Instant, SubscriptionLogResponse> grouped = new HashMap<>();

        for (FluxTable table : tables) {
            for (FluxRecord record : table.getRecords()) {
                Instant time = record.getTime();
                SubscriptionLogResponse resp = grouped.getOrDefault(time, new SubscriptionLogResponse());

                resp.setTimestamp(time);

                // Tags
                Map<String, Object> tags = record.getValues();
                if (tags.containsKey("trackingId")) resp.setTrackingId((String) tags.get("trackingId"));
                if (tags.containsKey("source")) resp.setSource((String) tags.get("source"));


                // Fields
                switch (record.getField()) {

                    case "action" -> resp.setAction((String) record.getValue());
                    case "type" -> resp.setType((String) record.getValue());
                    case "id" -> resp.setId((int) record.getValue());
                    case "publisherSubscriptionId" -> resp.setPublisherSubscriptionId((String) record.getValue());
                    case "quantity" -> resp.setQuantity((String) record.getValue());
                    case "name" -> resp.setName((String) record.getValue());
                    case "status" -> resp.setStatus((String) record.getValue());
                    case "orderId" -> resp.setOrderId((String) record.getValue());
                    case "publisher" -> resp.setPublisher((String) record.getValue());
                    case "organization" -> resp.setOrganization((String) record.getValue());
                    case "customerTenant" -> resp.setCustomerTenant((String) record.getValue());
                    case "product" -> resp.setProduct((String) record.getValue());
                    case "creationDate" -> resp.setCreationDate((String) record.getValue());
                    case "effectiveStartDate" -> resp.setEffectiveStartDate((String) record.getValue());
                    case "commitmentEndDate" -> resp.setCommitmentEndDate((String) record.getValue());
                    case "suspensionReasons" -> resp.setSuspensionReasons((List<String>) record.getValue());
                    case "acceptAutoSuspension" -> resp.setAcceptAutoSuspension((boolean) record.getValue());
                    case "autoSuspensionDate" -> resp.setAutoSuspensionDate((String) record.getValue());
                    case "availableAddonsCount" -> resp.setAvailableAddonsCount((int) record.getValue());
                    case "attestationAccepted" -> resp.setAttestationAccepted((boolean) record.getValue());
                    case "termDuration" -> resp.setTermDuration((String) record.getValue());
                    case "subscriptions" -> resp.setSubscriptions((List<String>) record.getValue());
                    case "subscriptionMaxTreshold" -> resp.setSubscriptionMaxTreshold((int) record.getValue());

                }

                grouped.put(time, resp);
            }
        }

        return new ArrayList<>(grouped.values());
    }

    public static String generateTrackingId(String source) {

        StringBuffer stringBuffer = new StringBuffer();
        Instant inst = Instant.now().truncatedTo(ChronoUnit.MILLIS);
        long timeStamp = inst.toEpochMilli();
        stringBuffer.append(source);
        stringBuffer.append("_");
        stringBuffer.append(timeStamp);
        return stringBuffer.toString();
    }

    public static void generateAndSetTrackingId(CreateCustomerTenantRequest createCustomerTenantRequest) {
        createCustomerTenantRequest.setTrackingId(generateTrackingId(createCustomerTenantRequest.getSource()));
    }

    public static void generateAndSetTrackingId(ConsentAgreement consentAgreement) {
        consentAgreement.setTrackingId(generateTrackingId(consentAgreement.getSource()));
    }

    public static void generateAndSetTrackingId(AssignSubscription assignSubscription) {
        assignSubscription.setTrackingId(generateTrackingId(assignSubscription.getSource()));
    }

    public static void generateAndSetTrackingId(AssignSubscriptionByNewCommerce assignSubscriptionByNewCommerce) {
        assignSubscriptionByNewCommerce.setTrackingId(generateTrackingId(assignSubscriptionByNewCommerce.getSource()));
    }

    public static void setTrackingIdAndSource(String source, String trackingId, CreateCustomerTenantResponse createCustomerTenantResponse) {
        createCustomerTenantResponse.setTrackingId(trackingId);
        createCustomerTenantResponse.setSource(source);
    }

    public static void setTrackingIdAndSource(String source, String trackingId, ConsentAgreement consentAgreement) {
        consentAgreement.setTrackingId(trackingId);
        consentAgreement.setSource(source);
    }

    public static void setTrackingIdAndSource(String source, String trackingId, AssignedSubscriptionResponse assignedSubscriptionResponse) {
        assignedSubscriptionResponse.setTrackingId(trackingId);
        assignedSubscriptionResponse.setSource(source);
    }

    public static void setTrackingIdAndSource(String source, String trackingId, AssignSubscriptionByNewCommerceResponse assignedSubscriptionResponse) {
        assignedSubscriptionResponse.setTrackingId(trackingId);
        assignedSubscriptionResponse.setSource(source);
    }


}
