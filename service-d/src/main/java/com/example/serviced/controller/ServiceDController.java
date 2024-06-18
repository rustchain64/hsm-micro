package com.example.serviced.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServiceDController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Service D";
    }
}
