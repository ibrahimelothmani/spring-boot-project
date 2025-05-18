package com.ibrahim.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// here we define the source of our beans using the @Configuration
@Configuration
public class AppConfig {

    @Value("${payment-gateway}")
    private String paymentGateway;

    // the name of the bean should be a name not a VERB

    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal(){
        return new PayPalPaymentService();
    }

    @Bean
    public OrderService orderService() {
        if (paymentGateway.equals("stripe")) {
            return new OrderService(stripe());
        }else {
            return new OrderService(paypal());
        }
    }
}
