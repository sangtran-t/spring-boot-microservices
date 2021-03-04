package com.ewallet.subengine.subscriber.service;

import com.ewallet.subengine.subscriber.model.Subscriber;
import com.ewallet.subengine.subscriber.repository.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriberService {

    @Autowired
    private SubscriberRepository subscriberRepository;

    public Subscriber saveSubscriber(Subscriber subscriber) {
        return subscriberRepository.save(subscriber);
    }

    public Subscriber getSubscriberById(Long id) {
        return subscriberRepository.findById(id).orElse(null);
    }
}
