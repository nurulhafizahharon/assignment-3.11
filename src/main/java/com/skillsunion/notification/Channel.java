package com.skillsunion.notification;

/*
    TODO:
    The channel of notification can be SMS or Email. 
    Set this class up a @Bean in the main class. Set the type to "SMS".
*/

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Channel {
    String type;

    @Bean
    public NotificationService notificationService() {
        NotificationService notificationService = new NotificationService();
        notificationService.setup("SMS", "This is from Channel class.");
        return notificationService;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
