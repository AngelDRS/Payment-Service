package com.example.examen;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public boolean processPayment(PaymentRequestDto request) {

        return request.getAmount()> 0 ;
    }
}
