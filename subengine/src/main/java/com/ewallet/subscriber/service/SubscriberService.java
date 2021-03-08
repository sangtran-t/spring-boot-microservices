package com.ewallet.subscriber.service;

import com.ewallet.subscriber.model.Subscriber;
import com.ewallet.subscriber.repository.SubscriberRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Service
public class SubscriberService implements RabbitListenerConfigurer {

    private static final Logger logger = LoggerFactory.getLogger(SubscriberService.class);

    @Autowired
    private SubscriberRepository subscriberRepository;

    public Subscriber saveSubscriber(Subscriber subscriber) {
        return subscriberRepository.save(subscriber);
    }

    public Subscriber getSubscriberById(Long id) {
        return subscriberRepository.findById(id).orElse(null);
    }

    @Override
    public void configureRabbitListeners(RabbitListenerEndpointRegistrar registrar) {

    }

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void receivedMessage(Subscriber subscriber) {
        logger.info("Subscriber Details Received is.. " + subscriber);
    }
}
