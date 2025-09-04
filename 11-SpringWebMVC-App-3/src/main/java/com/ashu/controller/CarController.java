package com.ashu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CarController {
	
	@GetMapping("/car/{carId}/color")
	public String getColor(@PathVariable("carId") Integer carId, Model model) {
		String color = (carId >= 100) ? "Red" : "Black";
		model.addAttribute("msg","Car color is "+color+".");
		return "index";
	}
}
