package com.example.myapplication.notification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.myapplication.notification.internal.notification;

@Service
public class notificationservice {
    private static final Logger LOG = LoggerFactory.getLogger(notificationservice.class);
    /*public void createNotification(notification notification) {
        LOG.info("Received notification by module dependency for product {} in date {} by {}.",
          notification.getProductName(),
          notification.getDate(),
          notification.getFormat());
    }*/
    @Async
    @EventListener
    public void notificationEvent(notificationDTO event){
      notification notification = toEntity(event);
      LOG.info("Received notification by event for product {} in date {} by {}.",
        notification.getProductName(),
        notification.getDate(),
        notification.getFormat());

    }

    private notification toEntity(notificationDTO event) {
        // Assuming you convert the event to notification entity here
        // You need to implement the conversion logic based on your data structure
        notification notification = new notification();
        notification.setProductName(event.getProductName());
        notification.setDate(event.getDate());
        notification.setFormat(event.getFormat());
        return notification;
    }
}
