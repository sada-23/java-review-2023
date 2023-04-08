package com.company.service;

import com.company.model.payment.AuthRequest;
import com.company.model.pos.Pos;

public interface PosSelectionService {
    Pos decidePaymentPos(AuthRequest authRequest);
}
