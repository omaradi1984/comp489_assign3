package com.example.assignment3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {

    @Autowired
    private SimpMessagingTemplate template;

    public void notifyOwner(String ownerUsername, String message) {
        template.convertAndSendToUser(ownerUsername, "/topic/notification", message);
    }
}
