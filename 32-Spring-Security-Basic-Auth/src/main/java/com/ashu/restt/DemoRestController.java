package com.ashu.restt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring Security Basic Auth";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Welcome Admin";
	}
}
