package com.retailbank.creditcardservice.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class CreditCheckGateway {

    private final RestTemplate restTemplate;
    private final String creditCheckServiceBaseUrl;

    public CreditCheckGateway(RestTemplate restTemplate,
                              @Value("${creditcheckservice.baseurl}") String creditCheckServiceBaseUrl) {
        this.restTemplate = restTemplate;
        this.creditCheckServiceBaseUrl = creditCheckServiceBaseUrl;
    }

    public CreditCheckResponse doCreditCheckForCitizen(int citizenNumber) {
        final String uri = UriComponentsBuilder.fromHttpUrl(creditCheckServiceBaseUrl)
                .path("credit-scores")
                .toUriString();

        final CreditCheckRequest request = new CreditCheckRequest(citizenNumber);
        final CreditCheckResponse creditCheckResponse = restTemplate.postForObject(uri, request, CreditCheckResponse.class);

        assert creditCheckResponse != null;
        if (!creditCheckResponse.getUuid().equals(request.getUuid())) {
            throw new RuntimeException("If the UUID from the response don't match the UUID from the request, something is wrong!");
        }

        return creditCheckResponse;
    }
}
