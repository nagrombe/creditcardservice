package com.retailbank.creditcardservice.gateway;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
public class CreditCheckRequest {

    @Getter
    private final int citizenNumber;

    @Getter
    private final String requestedDate = LocalDate.now().toString();
}
