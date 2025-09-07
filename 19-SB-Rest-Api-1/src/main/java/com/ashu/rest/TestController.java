package com.ashu.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/test")
	public ResponseEntity<String> test(){
		String msg = "Hello World! This is my first Spring Boot Rest API";
		
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
