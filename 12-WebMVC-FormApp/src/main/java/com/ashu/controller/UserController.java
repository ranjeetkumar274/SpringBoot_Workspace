package com.ashu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashu.entity.User;

@Controller
public class UserController {
	
	@GetMapping("/app")
	public String loadForm() {
		
		return "index";
	}
	
	@PostMapping("/user")
	public String handleForm(@ModelAttribute User user, Model model) {
		
		System.out.println(user);
		model.addAttribute("user", "User details submitted successfully!!");
		return "success";
	}
}
