package com.company.service;


import com.company.model.payment.AuthRequest;
import com.company.model.payment.PaymentResponse;

public interface PaymentService {
    PaymentResponse auth(AuthRequest authRequest);

    PaymentResponse auth3D(AuthRequest auth3DRequest);
}
