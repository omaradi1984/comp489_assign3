package com.example.assignment3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Assignment3Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment3Application.class, args);
	}
	@RestController
	class MessageController {

	    private final List<String> messages = new ArrayList<>();

	    // Get all messages
	    @GetMapping("/messages")
	    public List<String> getMessages() {
	        return messages;
	    }

	    // Add a message
	    @PostMapping("/messages")
	    public void addMessage(@RequestBody String message) {
	        messages.add(message);
	    }
}
}