package com.ibrahim.store;

import org.springframework.stereotype.Service;

@Service("stripe")
public class StripePaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount:" + amount);
    }
}
