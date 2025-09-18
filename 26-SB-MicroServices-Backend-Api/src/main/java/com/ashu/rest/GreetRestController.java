package com.ashu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/greet")
	public String greet() {
		return "This application is running on port : "+env.getProperty("local.server.port");
	}
}
