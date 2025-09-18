package com.ashu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.FeignGreetAPI;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private FeignGreetAPI feignGreetAPI;
	
	
	
	@GetMapping("/welcome")
	public String welcome() {
		
		String msg = feignGreetAPI.greet();
		return msg+" : How are you?";
	}
}
