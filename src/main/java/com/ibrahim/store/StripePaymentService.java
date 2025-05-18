package com.ibrahim.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("stripe")
public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount:" + amount);
    }
}
