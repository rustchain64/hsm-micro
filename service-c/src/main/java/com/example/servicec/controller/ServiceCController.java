package com.example.servicec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServiceCController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Service C";
    }
}
