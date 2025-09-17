package com.ashu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	
	@GetMapping("/greet")
	public String greet() {
		return "Hello, Welcome to Microservices World!!!";
	}
}
