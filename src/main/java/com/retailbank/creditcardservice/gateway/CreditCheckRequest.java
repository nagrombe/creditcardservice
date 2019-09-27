package com.retailbank.creditcardservice.gateway;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreditCheckRequest {

    @Getter
    private final int citizenNumber;
}
