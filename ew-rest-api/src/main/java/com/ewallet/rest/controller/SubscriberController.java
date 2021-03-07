package com.ewallet.rest.controller;

import com.ewallet.rest.model.Subscriber;
import com.ewallet.rest.request.SubscriberRegisterRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/subscriber")
public class SubscriberController {

    @PostMapping("/register")
    public SubscriberRegisterRequest registerNewSubscriber(@RequestBody SubscriberRegisterRequest subscriberRegisterPayload) {
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
