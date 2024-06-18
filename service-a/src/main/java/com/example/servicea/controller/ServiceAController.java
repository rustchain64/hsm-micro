package com.example.servicea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServiceAController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Service A";
    }
}
