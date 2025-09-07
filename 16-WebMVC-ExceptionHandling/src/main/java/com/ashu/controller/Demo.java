package com.ashu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo {
	
	@GetMapping("/show")
	@ResponseBody
	public String show() {
		System.out.println("in show");
		int i = 10 / 0;
		return "Hello there";
	}
	
////	Method-level Exception Handling
//	@ExceptionHandler(ArithmeticException.class)
//	public String handleArithExp(ArithmeticException e) {
//		System.out.println("in handle arith exp " + e);
//		return "error";
//	}
}
