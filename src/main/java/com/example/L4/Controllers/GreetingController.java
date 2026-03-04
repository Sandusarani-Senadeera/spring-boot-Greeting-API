package com.example.L4.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }

    // http://localhost:8080/greet
    @GetMapping("/greet")
    public String greet() {
        return "Welcome to Spring Boot!";
    }

    // http://localhost:8080/greet/John
    // http://localhost:8080/greet/John?message=Good%20Morning
    @GetMapping("/greet/{name}")
    public String greetByName(
            @PathVariable String name,
            @RequestParam(required = false) String message
    ) {
        if (message == null || message.trim().isEmpty()) {
            return "Hello " + name + "! Welcome to Spring Boot!";
        }
        return "Hello " + name + "! " + message;
    }
}
