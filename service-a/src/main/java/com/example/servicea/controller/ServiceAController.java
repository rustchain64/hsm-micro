package com.example.servicea.controller;

import com.example.servicea.kafka.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class ServiceAController {

    // Test Connection Ability
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Service A";
    }

    private final KafkaProducerService kafkaProducerService;

    @Autowired
    public ServiceAController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        kafkaProducerService.sendMessage("my-topic", message);
        return "Message sent to Kafka topic 'my-topic': " + message;
    }
}
