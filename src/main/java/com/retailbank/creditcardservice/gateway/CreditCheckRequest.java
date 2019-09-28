package com.retailbank.creditcardservice.gateway;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@RequiredArgsConstructor
public class CreditCheckRequest {

    @Getter
    private final int citizenNumber;

    @Getter
    private final String requestedDate = LocalDate.now().toString();

    @Getter
    private final String uuid = UUID.randomUUID().toString();
}
