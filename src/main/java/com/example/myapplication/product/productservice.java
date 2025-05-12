package com.example.myapplication.product;
import java.util.Date;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import com.example.myapplication.notification.notificationDTO;
import com.example.myapplication.notification.notificationservice;
import com.example.myapplication.product.internal.product;


@Service
public class productservice {
    private final ApplicationEventPublisher events;
    private final notificationservice notificationService;

    public productservice(ApplicationEventPublisher events, notificationservice notificationService) {        
        this.events = events;
        this.notificationService = notificationService;
    }

    public void createProduct(String name, String description, int price) {
        product p = new product(name, description, price);
       events.publishEvent(new notificationDTO(new Date(), "SMS", p.getName()));
    }
}
