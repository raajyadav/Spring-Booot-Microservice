package com.jspider.service;

import com.jspider.request.Passenger;
import com.jspider.response.Ticket;

public interface MakeMyTripService {

	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicketByNum(Integer ticketNumber);
	
	
}
