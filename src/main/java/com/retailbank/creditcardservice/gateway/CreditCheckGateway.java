package com.retailbank.creditcardservice.gateway;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RequiredArgsConstructor
@Component
public class CreditCheckGateway {

    private final RestTemplate restTemplate;

    public CreditCheckResponse.Score doCreditCheckForCitizen(int citizenNumber) {
        final String uri = UriComponentsBuilder.fromHttpUrl("http://localhost:8080")
                .path("credit-scores")
                .toUriString();

        return restTemplate.postForObject(uri, new CreditCheckRequest(citizenNumber), CreditCheckResponse.class).getScore();
    }
}
