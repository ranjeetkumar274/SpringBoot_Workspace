package com.ashu.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ashu.request.Passenger;
import com.ashu.response.Ticket;
import com.ashu.service.TicketService;


@Controller
public class FormAndTicketController {
	
	@Autowired
	private TicketService ticketService;
	
	
	@GetMapping("/search")
	public String showSearch() {
		return "search";
	}
	
	@GetMapping("/searchticket")
	public String showTicket(@RequestParam("pnr") long pnr) {
		System.out.println("PNR: " + pnr);
		return "search";
	}
	
	@GetMapping("/")
	public String showForm() {
		return "index";
	}
	
	@PostMapping("/ticket")
	public String showTicket(@ModelAttribute Passenger passenger, Model model) {
		System.out.println(passenger);
		Ticket newTicket = ticketService.ticketBooking(passenger);
		System.out.println(newTicket);
		model.addAttribute("ticket", newTicket);	
		return "success";
	}
}
