package com.example.serviceb.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "my-topic", groupId = "service-b-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
