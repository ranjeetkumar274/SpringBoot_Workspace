package com.ashu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashu.entity.Product;

import jakarta.validation.Valid;

@Controller
public class ProductController {
	
	@GetMapping("/")
	public String addProduct( Model model) {
		model.addAttribute("product", new Product());
		return "index";
	}
	
	@PostMapping("/product")
	public String handleProduct(@Valid Product product, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "index";
		}else {
			System.out.println(product);
			model.addAttribute("product", product);
		}
		return "saved";
	}
}
