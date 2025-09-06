package com.ashu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class DemoController {
	
	@GetMapping("/demo")
	public String getMsg() {
		return "Hello Ashuuuu";
	}
}
