package com.retailbank.creditcardservice.controller;

import lombok.Getter;
import lombok.Setter;

public class ApplyForCreditCardRequest {
    @Getter
    @Setter
    private int citizenNumber;

    @Getter
    @Setter
    private CardType cardType;

    public enum CardType {
        GOLD
    }
}
