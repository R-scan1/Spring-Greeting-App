package com.bridgelabz.demo.controller;

import com.bridgelabz.demo.model.Greeting;
import com.bridgelabz.demo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public String getGreeting() {
        return "GET: " + greetingService.getGreetingMessage();
    }

    @PostMapping
    public Greeting postGreeting(@RequestParam(required = false) String firstName,
                                 @RequestParam(required = false) String lastName) {
        String message = greetingService.displayingGreeting(firstName, lastName);
        return greetingService.saveGreeting(message); // Save & return JSON response
    }

    @PutMapping
    public String putGreeting() {
        return "PUT: " + greetingService.getGreetingMessage();
    }

    @DeleteMapping
    public String deleteGreeting() {
        return "DELETE: " + greetingService.getGreetingMessage();
    }

    @GetMapping("/params")
    public String getGreetingParams(@RequestParam(required = false) String firstName,
                                    @RequestParam(required = false) String lastName) {
        return greetingService.displayingGreeting(firstName, lastName);
    }
}
