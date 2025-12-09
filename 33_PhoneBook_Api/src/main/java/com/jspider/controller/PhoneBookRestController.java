package com.jspider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.binding.PhoneBook;
import com.jspider.service.PhoneBookService;

@RestController
public class PhoneBookRestController {

	@Autowired
	private PhoneBookService service;

	@PostMapping(value ="/contact",
			  consumes = {"application/json"},
			  produces = {"application/json"}
	  )
	public ResponseEntity<PhoneBook> insertContacts(@RequestBody PhoneBook phoneBook) {
		PhoneBook saved = service.upsertContacts(phoneBook);
		return new ResponseEntity<>(saved, HttpStatus.CREATED);
	}

	@GetMapping(value ="/contact/{id}",
		      produces = "application/json"	
		)
	public ResponseEntity<PhoneBook> getContact(@PathVariable Integer id) {
		PhoneBook phoneBook = service.getById(id);
		return new ResponseEntity<>(phoneBook, HttpStatus.OK);
	}

	@GetMapping(value ="/contacts",
		      produces = "application/json"	
		)
	public ResponseEntity<List<PhoneBook>> getAllContacts() {
		List<PhoneBook> allContacts = service.getAllContacts();
		return new ResponseEntity<>(allContacts, HttpStatus.OK);
	}


	@PutMapping(value ="/contact",
    produces = "application/json"	
)
	public ResponseEntity<PhoneBook> updateContact(@RequestBody PhoneBook phoneBook) {
		PhoneBook status = service.upsertContacts(phoneBook);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}


	@DeleteMapping(value ="/contact/{id}",
    produces = "application/json"	
)
	public ResponseEntity<String> deleteContact(@PathVariable Integer id) {
		String status = service.deleteById(id);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

}
