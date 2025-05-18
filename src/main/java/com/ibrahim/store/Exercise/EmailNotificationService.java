package com.ibrahim.store.Exercise;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {
    /**
     * @param message
     * @param recipientEmail
     */

    @Value("${email.server.host}")
    private String host;
    @Value("${email.server.port}")
    private String port;

    @Override
    public void send(String message, String recipientEmail) {

        System.out.println("The Message: " + message);
        System.out.println("The RecipientEmail: " + recipientEmail);

        System.out.println("The HOST: " + host);
        System.out.println("The PORT: " + port);
    }
}
