package com.retailbank.creditcardservice.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ApplyForCreditCardResponse {
    @Getter
    private final Status status;

    @Getter
    private final String uuid;

    public enum Status {
        DENIED, GRANTED
    }
}
