package com.ewallet.rest.controller;

import com.ewallet.rest.model.Subscriber;
import com.ewallet.rest.request.SubscriberRegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/api/subscriber")
public class SubscriberController {

    @PostMapping("/register")
    public SubscriberRegisterRequest registerNewSubscriber(@RequestBody SubscriberRegisterRequest subscriberRegisterPayload) {
        final String url = "http://localhost:8001/subscriber/save";
        RestTemplate restTemplate = new RestTemplate();
        Subscriber res = restTemplate.postForObject(url, subscriberRegisterPayload, Subscriber.class);
        System.out.println(res);
        return subscriberRegisterPayload;
    }

    @PostMapping("/login")
    public Subscriber systemLogin(@RequestBody Subscriber subscriber) {
        return subscriber;
    }

    @PostMapping("/logout")
    public Subscriber systemLogout(@RequestBody Subscriber subscriber) {
        return subscriber;
    }

    @PostMapping("/forgot")
    public Subscriber forgotPassword(@RequestBody Subscriber subscriber) {
        return subscriber;
    }

    @PostMapping("/update")
    public Subscriber updateProfile (@RequestBody Subscriber subscriber) {
        return subscriber;
    }

}
