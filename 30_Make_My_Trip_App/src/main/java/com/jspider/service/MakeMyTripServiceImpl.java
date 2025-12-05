package com.jspider.service;

//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.jspider.request.Passenger;
import com.jspider.response.Ticket;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

	private String BOOK_TICKET_URL ="https://uncarried-hans-ungroupable.ngrok-free.dev/ticket";

	private String GET_TICKET_URL ="https://uncarried-hans-ungroupable.ngrok-free.dev/ticket/{ticketNum}";

	@Override
	public Ticket bookTicket(Passenger passenger) {
		
	WebClient webClient = WebClient.create();
	
   Ticket ticket =	webClient.post()
		                      .uri(BOOK_TICKET_URL)
		                      .bodyValue(passenger)
		                      .retrieve()
		                      .bodyToMono(Ticket.class)
		                      .block();
   
   return ticket;
		

//		RestTemplate rt = new RestTemplate();
//
//		ResponseEntity<Ticket> respEntity = rt.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class);
//
//		Ticket ticket = respEntity.getBody();
//
//		return ticket;

	}

	@Override
	public Ticket getTicketByNum(Integer ticketNumber) {
		
		//get the instance of webclient (imp class)
		WebClient webClient = WebClient.create();
		
//		send get request and map response to Ticket Obj
		Ticket ticket =  webClient.get()
		                          .uri(GET_TICKET_URL,ticketNumber)
		                          .retrieve()
		                          .bodyToMono(Ticket.class)
		                          .block();
		
		return ticket;
//
//		RestTemplate rt = new RestTemplate();
//
//		ResponseEntity<Ticket> respEntity = rt.getForEntity(GET_TICKET_URL, Ticket.class, ticketNumber);
//
//		Ticket ticket = respEntity.getBody();
//
//		return ticket;
	}

}
