package com.ashu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@GetMapping("/welcome")
    public String showPage(@RequestParam(name="name") String name, Model model) {
        model.addAttribute("msg", "Hello, "+name+" JSP is working ");
        return "index"; 
	}
}
