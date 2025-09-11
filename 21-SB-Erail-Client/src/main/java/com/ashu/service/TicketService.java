package com.ashu.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.ashu.request.Passenger;
import com.ashu.response.Ticket;

@Service
public class TicketService {
	
	@Value("${erail.api.key.booking}")
	private String ERAIL_API_1;
	
	@Value("${erail.api.key.search}")
	private String ERAIL_API_2;
	
	
	
	public Ticket getTicketByPnr(long pnr) {
		
		WebClient webClient = WebClient.create();
		Ticket ticket = webClient.get()
				.uri(ERAIL_API_2,pnr)
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToMono(Ticket.class)
				.block();
		
		if(ticket != null) {
			return ticket;
		}
		return null;
	}
	
	public Ticket ticketBooking(Passenger passenger) {
		WebClient webClient = WebClient.create();
		Ticket ticket = webClient.post()
				.uri(ERAIL_API_1)
				.body(BodyInserters.fromValue(passenger))
				.header("Content-Type", "application/json")
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToMono(Ticket.class)
				.block();
		
		if(ticket != null) {
			return ticket;
		}
		return null;
		}
	}
