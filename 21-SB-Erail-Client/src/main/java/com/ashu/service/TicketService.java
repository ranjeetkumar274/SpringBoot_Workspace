package com.ashu.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ashu.request.Passenger;
import com.ashu.response.Ticket;

@Service
public class TicketService {
	
	@Value("${erail.api.key.booking}")
	private String ERAIL_API_1;
	
	@Value("${erail.api.key.search}")
	private String ERAIL_API_2;
	
	
	
	public Ticket getTicketByPnr(long pnr) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Ticket> response = restTemplate.getForEntity(ERAIL_API_2, Ticket.class, pnr);
		int statusCode = response.getStatusCodeValue();
		if(statusCode == 200) {
			return response.getBody();
		}
		return null;
	}
	
	public Ticket ticketBooking(Passenger passenger) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Ticket> response = restTemplate.postForEntity(ERAIL_API_1, passenger, Ticket.class);
		int statusCode = response.getStatusCodeValue();
		if(statusCode == 200) {
			return response.getBody();
		}
		return null;
	}
}
