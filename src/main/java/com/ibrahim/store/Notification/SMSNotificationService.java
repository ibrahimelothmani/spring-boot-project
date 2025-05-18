package com.ibrahim.store.Notification;


import org.springframework.stereotype.Service;

@Service("notification")
public class SMSNotificationService implements NotificationService{

    /**
     * @param message
     */
    @Override
    public void send(String message) {
        System.out.println("SMS Notification");
        System.out.println("Message:" + message);
    }
}
