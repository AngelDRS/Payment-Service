package com.example.examen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {

    @Test
    void processPayment() {
        // arrange
         PaymentService paymentService = new PaymentService();
         //act
            PaymentRequestDto validRequest = new PaymentRequestDto("4111111111111111", "123", "12/25", 100);
            //assert
            assertTrue(paymentService.processPayment(validRequest));
        }

    }
