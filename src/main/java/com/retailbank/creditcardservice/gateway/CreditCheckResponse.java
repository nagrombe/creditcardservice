package com.retailbank.creditcardservice.gateway;

import lombok.Getter;
import lombok.Setter;

public class CreditCheckResponse {
    @Getter
    @Setter
    private Score score;

    @Getter
    @Setter
    private String uuid;

    public enum Score {
        LOW, HIGH
    }
}
