package com.ewallet.subengine.subscriber.repository;

import com.ewallet.subengine.subscriber.model.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, Long> { }
