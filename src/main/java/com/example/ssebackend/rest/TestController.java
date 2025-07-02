package com.example.ssebackend.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    // curl http://localhost:8080/api/test
    @GetMapping
    public String testEndpoint() {
        return "Hello, this is a test endpoint!";
    }
}
