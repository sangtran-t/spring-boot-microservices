package com.ewallet.subscriber.controller;

import com.ewallet.subscriber.model.Subscriber;
import com.ewallet.subscriber.service.SubscriberService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subscriber")
public class SubscriberController {

    @Value("${app.message}")
    private String message;

    @Autowired
    private SubscriberService subscriberService;

    @PostMapping("/save")
    public String saveSubscriber(@RequestBody Subscriber subscriber) {
//        subscriberService.send(subscriber);
//        return subscriberService.saveSubscriber(subscriber);
        return message;
    }

    @GetMapping("/info/{id}")
    public Subscriber getSubscriberById(@PathVariable Long id) {
        return subscriberService.getSubscriberById(id);
    }

}
