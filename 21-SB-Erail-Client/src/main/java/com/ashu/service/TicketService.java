package com.ashu.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ashu.request.Passenger;
import com.ashu.response.Ticket;

@Service
public class TicketService {
	
	private static final String ERAIL_API_KEY = "http://54.167.78.42:8080/bookticket";
	
	public Ticket ticketBooking(Passenger passenger) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Ticket> response = restTemplate.postForEntity(ERAIL_API_KEY, passenger, Ticket.class);
		int statusCode = response.getStatusCodeValue();
		if(statusCode == 200) {
			return response.getBody();
		}
		return null;
	}
}
