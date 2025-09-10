package com.ashu.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.request.Passenger;
import com.ashu.response.Ticket;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ErailRestController {
	
	

	
	private Map<Long, Ticket> ticketDb = new HashMap<>();
	
	
	@PostMapping(
			value = "/bookticket",
			consumes = "application/json",
			produces = "application/json"
			)
	public Ticket bookTicket(@RequestBody Passenger passenger) {
		
		Random ran = new Random();
		long pnr = ran.nextLong(1000000000L, 9999999999L);
		
		Ticket t = new Ticket();
		t.setPnr(pnr);
		t.setStatus("CONFIRMED");
		t.setFrom(passenger.getFrom());
		t.setTo(passenger.getTo());
		t.setDoj(passenger.getDoj());
		t.setTrainNo(passenger.getTrainNo());
		
		ticketDb.put(pnr, t);
		System.out.println("Ticket booked with pnr:POST: "+pnr);
		
		return t;
	}
	
	
	@GetMapping(
			value = "/ticket/{pnr}",
			produces = "application/json"
			)
	public Ticket getTicket(@PathVariable("pnr") long pnr) {
		if(ticketDb.containsKey(pnr)) {
			System.out.println("Ticket found for pnr :GET: "+pnr);
			return ticketDb.get(pnr);
			
		}
		return null;
	}
}
