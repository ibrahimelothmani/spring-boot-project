package com.ibrahim.store;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


//@Service
public class OrderService {
    private PaymentService paymentService;

    public OrderService() {}

    // when we declare 2 beans we get error because spring is confused between chosen PayPalPaymentService and StripPaymentService
    // => so for that we use the annotation @Primary OR @Qualifier

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

//    @Autowired
//    public OrderService(@Qualifier("stripe") PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder() {
        paymentService.processPayment(200);
    }
}
