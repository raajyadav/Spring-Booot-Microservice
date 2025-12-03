package com.jspider.rest;
import com.jspider.service.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.request.Passenger;
import com.jspider.response.Ticket;
import com.jspider.service.BookingService;

@RestController
public class BookingRestController {

    private final BookingServiceImpl bookingServiceImpl;

	@Autowired
	private BookingService service;

    BookingRestController(BookingServiceImpl bookingServiceImpl) {
        this.bookingServiceImpl = bookingServiceImpl;
    }
	
	@PostMapping(value ="/ticket",
			  consumes = {"application/json"},
			  produces = {"application/json"}
	  )
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger)	{
		System.out.println(passenger);
		
		Ticket ticket = service.bookTicket(passenger);
		
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}
	
	@GetMapping(value ="ticket/{ticketNum}",
		      produces = "application/json"	
		)
	public Ticket getTicketByNum(@PathVariable Integer ticketNum) {
	    return	service.getTicket(ticketNum);
	}
	
	
}
