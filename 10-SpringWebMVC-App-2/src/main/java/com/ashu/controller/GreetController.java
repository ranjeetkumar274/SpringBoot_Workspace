package com.ashu.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class GreetController {
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {
		ModelAndView mav1 = new ModelAndView();
		
		LocalDate now = LocalDate.now();
		mav1.addObject("msg", "Good AfterNoon todays date is " + now);
		mav1.setViewName("index");
		
		return mav1;
	}
}
