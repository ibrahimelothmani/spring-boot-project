package com.ibrahim.store;

import com.ibrahim.store.Notification.NotificationManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//        ApplicationContext context2 = SpringApplication.run(StoreApplication.class, args);
        // Using Bean
        // A bean is an object created by Spring Core => IoC
//        var orderService = context.getBean(OrderService.class);
//        orderService.placeOrder();
//      => the app is crached => SOLUTION: we use annotation in the OrderService class (@Component)

//        var orderService = new OrderService(new StripePaymentService());
//        orderService.placeOrder(); => to see this order in action we declare an instance here then we run our app

//        var orderService = new OrderService(new PayPalPaymentService());
//        orderService.placeOrder();
//        var notification = new NotificationManager();
//        notification.sending("Notification is SEND");

//        context.getBean(NotificationManager.class).sending("Notification is SEND");

        context.getBean(OrderService.class).placeOrder();
//        context2.getBean(OrderService.class).placeOrder();
        context.close();
    }
}
