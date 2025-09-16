package com.ashu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.exception.CustomerNotFoundException;

@RestController
public class CustomerRestController {
	
	
	@GetMapping("/customers/{customerId}")
	@ResponseBody
	public String getCustomer(@PathVariable("customerId") Integer customerId) {
		if(customerId > 100) {
			return "Ashu";
		} else {
			throw new CustomerNotFoundException("Customer not found with id: " + customerId);
		}
		
	}
}
