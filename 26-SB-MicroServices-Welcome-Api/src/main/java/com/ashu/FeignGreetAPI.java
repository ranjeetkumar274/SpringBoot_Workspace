package com.ashu;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "26-SB-MICROSERVICES-BACKEND-API")
public interface FeignGreetAPI {
	
	@GetMapping("/greet")
	public String greet();
}
