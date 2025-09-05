package com.ashu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashu.entity.User;
import com.ashu.repository.UserRepository;

@Controller
public class UserController {
	
	
	private UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}	
	
	@GetMapping("/app")
	public String loadForm() {
		
		return "index";
	}
	
	@PostMapping("/user")
	public String handleForm(@ModelAttribute User user, Model model) {
		
		System.out.println(user);
		userRepository.save(user);
		
		model.addAttribute("user", "User details submitted successfully!!");
		return "success";
	}
}
