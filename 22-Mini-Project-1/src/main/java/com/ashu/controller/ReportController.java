package com.ashu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashu.entities.CitizenPlanInfo;
import com.ashu.request.SearchRequest;
import com.ashu.service.ReportService;

@Controller
public class ReportController {


	@Autowired
	private ReportService reportService;

	@PostMapping("/search")
	public String loadPlans(@ModelAttribute("search") SearchRequest searchRequest, Model model) {
		model.addAttribute("planNames", reportService.getPlanNames());
		model.addAttribute("planStatus", reportService.getPlanStatus());
		
		List<CitizenPlanInfo> plans = reportService.search(searchRequest);
		model.addAttribute("plans", plans);

		System.out.println(searchRequest);

		return "index";
	}

	@GetMapping("/")
	public String loadForm(Model model) {
		
		
		SearchRequest searchRequest = new SearchRequest();
		model.addAttribute("search", searchRequest);
		model.addAttribute("planNames", reportService.getPlanNames());
		model.addAttribute("planStatus", reportService.getPlanStatus());

		

		return "index";
	}

}
