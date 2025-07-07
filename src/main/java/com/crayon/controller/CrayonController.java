package com.crayon.controller;

import com.crayon.model.*;
import com.crayon.service.CrayonService;
import com.crayon.service.TokenService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CrayonController {

    private static final Logger logger = LoggerFactory.getLogger(CrayonController.class);

    @Autowired
    TokenService tokenService;

    @Autowired
    CrayonService crayonService;

    @GetMapping("/getAccessToken")
    public TokenResponse getAccessToken() {
        return tokenService.getAccessToken();
    }


    @PostMapping("/createCustomerTenant")
    public CreateCustomerTenantResponse createCustomer(@RequestBody @Valid CreateCustomerTenantRequest createCustomerTenantRequest) {
        return crayonService.createTenant(createCustomerTenantRequest);
    }

    @PostMapping("/consentAgreement/{id}")
    public ConsentAgreement consentAgreement(@PathVariable String id,@RequestBody @Valid ConsentAgreement consentAgreement) {
        return crayonService.consentAgreement(id,consentAgreement);
    }

    @PostMapping("/assignSubsciption/{id}")
    public AssignedSubscriptionResponse assignSubscription(@RequestBody @Valid AssignSubscription assignSubscription) {
        return crayonService.createAssignment(assignSubscription);
    }

    @PostMapping("/assignSubsciptionByNewCommerce/{id}")
    public AssignSubscriptionByNewCommerceResponse assignSubscriptionByNewCommerceId(@RequestBody @Valid AssignSubscriptionByNewCommerce assignSubscription) {
        return crayonService.createAssignmentByNewCommerceId(assignSubscription);
    }


    @GetMapping("/getCustomerTenantById")
    public Tenant getTenantById(@PathVariable String id, @RequestParam String source) {
        return crayonService.getTenantById(id,source);
    }

    @GetMapping("/getSubscriptionById")
    public SubscriptionResponse getSubscriptionById(@PathVariable String id, @RequestParam String source) {
        return crayonService.getSubscriptionById(id,source);
    }

    @GetMapping("/getCreateCustomerTenantReqRespBySource")
    public ResponseEntity<List<CreateCustomerTenantReqResp>> GetCreateCustomerTenantReqRespBySource(@RequestParam(value="source") String source,String trackingId) {

        List<CreateCustomerTenantReqResp> resp=crayonService.GetCreateCustomerTenantReqRespBySource(source,trackingId);
        return ResponseEntity.ok(resp);

    }

    @GetMapping("/getBySourceInConsentAgreementReqResp")
    public ResponseEntity<List<ConsentAgreementReqResp>> GetBySourceInConsentAgreementReqResp(@RequestParam(value="source") String source,String trackingId) {

        List<ConsentAgreementReqResp> resp=crayonService.GetBySourceInConsentAgreementReqResp(source,trackingId);
        return ResponseEntity.ok(resp);

    }

    @GetMapping("/getBySourceInAssignSubscriptionReqResp")
    public ResponseEntity<List<AssignSubscriptionReqResp>> GetBySourceInAssignSubscriptionReqResp(@RequestParam(value="source") String source,String trackingId) {

        List<AssignSubscriptionReqResp> resp=crayonService.GetBySourceInAssignSubscriptionReqResp(source,trackingId);
        return ResponseEntity.ok(resp);

    }

    @GetMapping("/getBySourceInAssignSubscriptionNewCommerceReqResp")
    public ResponseEntity<List<AssignSubscriptionByNewCommerceLogResponse>> GetBySourceInAssignSubscriptionNewCommerceReqResp(@RequestParam(value="source") String source,String trackingId) {

        List<AssignSubscriptionByNewCommerceLogResponse> resp=crayonService.GetBySourceInAssignSubscriptionNewCommerceReqResp(source,trackingId);
        return ResponseEntity.ok(resp);

    }

    @GetMapping("/getBySourceInGetByTenantId")
    public ResponseEntity< List<TenantResponse>> GetBySourceInGetByTenantId(String source,String trackingId) {

        List<TenantResponse> resp=crayonService.GetBySourceInGetByTenantId(source,trackingId);
        return ResponseEntity.ok(resp);

    }

    @GetMapping("/getBySourceInGetBySubscriptionId")
    public ResponseEntity< List<SubscriptionLogResponse>> getBySourceInGetBySubscriptionId(String source,String trackingId) {

        List<SubscriptionLogResponse> resp=crayonService.getBySourceInGetBySubscriptionId(source,trackingId);
        return ResponseEntity.ok(resp);

    }

    //http://localhost:8080/oauth2/token - to get Oauth to access this application
}
