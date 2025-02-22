package com.bridgelabz.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    private final String message = "Hello from BridgeLabz";

    @GetMapping
    public String getGreeting() {
        return "{\"GET\": \"" + message + "\"}";
    }

    @PostMapping
    public String postGreeting() {
        return "{\"POST\": \"" + message + "\"}";
    }

    @PutMapping("/{name}")
    public String putGreeting(@PathVariable String name) {
        return "{\"PUT\": \"" + message + "\"}";
    }

    @DeleteMapping("/{name}")
    public String deleteGreeting(@PathVariable String name) {
        return "{\"DELETE\": \"" + message + "\"}";
    }
}
