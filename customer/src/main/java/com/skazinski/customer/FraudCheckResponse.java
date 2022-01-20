package com.skazinski.customer;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FraudCheckResponse {

    private boolean isFraudster;
}
