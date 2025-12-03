package com.jspider.service;

import com.jspider.request.Passenger;
import com.jspider.response.Ticket;

public interface BookingService {
	
    public Ticket bookTicket(Passenger passenger);
    
    public Ticket getTicket(Integer ticketNumber);
	
}
