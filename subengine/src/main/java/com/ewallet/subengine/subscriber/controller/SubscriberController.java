package com.ewallet.subengine.subscriber.controller;

import com.ewallet.subengine.subscriber.model.Subscriber;
import com.ewallet.subengine.subscriber.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscriber")
public class SubscriberController {

    @Autowired
    private SubscriberService subscriberService;

    @PostMapping("/")
    public Subscriber saveSubscriber(@RequestBody Subscriber subscriber){
        return subscriberService.saveSubscriber(subscriber);
    }
}
