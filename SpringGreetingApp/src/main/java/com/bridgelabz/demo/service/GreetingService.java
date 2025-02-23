package com.bridgelabz.demo.service;

import org.springframework.stereotype.Service;
import com.bridgelabz.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.bridgelabz.demo.repository.*;
import org.springframework.context.annotation.ComponentScan;
import java.util.List;



@Service
@ComponentScan(basePackages = "com.bridgelabz.demo.repository")
public class GreetingService {
	
	@Autowired
    private GreetingRepository greetingRepository;

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
    
    public Greeting saveGreeting(String message) {
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }
    
    public Greeting getGreetingById(Long id) {
        return greetingRepository.findById(id).orElse(null);
    }
    
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }
    
    public Greeting updateGreeting(Long id, String newMessage) {
        Greeting greeting = greetingRepository.findById(id).orElse(null);
        if (greeting != null) {
            greeting.setMessage(newMessage);
            return greetingRepository.save(greeting); 
        } else {
            return null; 
        }
    }
    
    public boolean deleteGreeting(Long id) {
        Greeting greeting = greetingRepository.findById(id).orElse(null);
        if (greeting != null) {
            greetingRepository.delete(greeting);
            return true;
        } else {
            return false;
        }
    }
}
