package com.example.ssebackend.rest;

import com.block.idgenerator.IdGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @Resource
    private IdGenerator idGenerator;

    // curl http://localhost:8080/api/test
    @GetMapping
    public String testEndpoint() {
        return "Hello, this is a test endpoint!";
    }

    // curl http://localhost:8080/api/test/id
    @GetMapping("/id")
    public String testEndpointWithId() {
        return idGenerator.generate();
    }

}
