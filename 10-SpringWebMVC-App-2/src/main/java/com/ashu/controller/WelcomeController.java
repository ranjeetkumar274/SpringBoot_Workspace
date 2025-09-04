package com.ashu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcom")
	public ModelAndView getWelcomeMsg() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg1", "Welcome Back!!!");
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/say")
	public ModelAndView getGreetMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Good AfterNoon............");
		mav.setViewName("index");
		
		return mav;
	}

}
