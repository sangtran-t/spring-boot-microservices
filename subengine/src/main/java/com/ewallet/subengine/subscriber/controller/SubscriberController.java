package com.ewallet.subengine.subscriber.controller;

import com.ewallet.subengine.subscriber.model.Subscriber;
import com.ewallet.subengine.subscriber.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subscriber")
public class SubscriberController {

    @Autowired
    private SubscriberService subscriberService;

    @PostMapping("/save")
    public Subscriber saveSubscriber(@RequestBody Subscriber subscriber) {
        return subscriberService.saveSubscriber(subscriber);
    }

    @GetMapping("/info/{id}")
    public Subscriber getSubscriberById(@PathVariable Long id) {
        return subscriberService.getSubscriberById(id);
    }

}
