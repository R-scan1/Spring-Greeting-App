package com.bridgelabz.demo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreetingMessage() {
        return "Hello from BridgeLabz";
    }
    
    public String displayingGreeting(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello " + firstName + " " + lastName + " from BridgeLabz";
        } else if (firstName != null) {
            return "Hello " + firstName + " from BridgeLabz";
        } else if (lastName != null) {
            return "Hello " + lastName + " from BridgeLabz";
        } else {
            return "Hello World";
        }
    }
}
