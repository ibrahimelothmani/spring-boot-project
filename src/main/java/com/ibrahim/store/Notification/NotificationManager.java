package com.ibrahim.store.Notification;


import com.sun.nio.sctp.Notification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class NotificationManager {

    private final NotificationService notificationService;

    public void sending(String message) {
        notificationService.send("Notification Sending: " + message);
    }
}
