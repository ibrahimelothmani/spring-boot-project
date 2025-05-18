package com.ibrahim.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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
        System.out.println("OrderService is created");
    }

//    @Autowired
//    public OrderService(@Qualifier("stripe") PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder() {
        paymentService.processPayment(200);
    }

    @PostConstruct
    public void init() {
        System.out.println("OrderService PostConstruct");
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("OrderService PreDestroy");
    } // this will not show in the console
}
