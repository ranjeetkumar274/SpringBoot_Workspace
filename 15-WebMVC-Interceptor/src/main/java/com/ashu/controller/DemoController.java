package com.ashu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	@GetMapping("/display")
	@ResponseBody
	public String display() throws InterruptedException {
		Thread.sleep(500);
		return "Hey there!";
	}
}
