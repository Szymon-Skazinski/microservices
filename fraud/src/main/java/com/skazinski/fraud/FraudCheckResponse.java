package com.skazinski.fraud;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class FraudCheckResponse {

    private boolean isFraudster;
}
