package com.ibrahim.store.Notification;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {

    /**
     * @param message
     */
    @Override
    public void send(String message) {
        System.out.println("Email Notification");
        System.out.println("Message:" + message);
    }
}
