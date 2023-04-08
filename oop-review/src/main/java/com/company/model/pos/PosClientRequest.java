package com.company.model.pos;


import com.company.model.AbstractPosClientRequest;

import java.math.BigDecimal;

public class PosClientRequest extends AbstractPosClientRequest {
    public PosClientRequest(BigDecimal requestedAmount) {
        super(requestedAmount);
    }
}
