package com.jspider.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.jspider.request.Customer;
import com.jspider.response.User;

@Service
public class UserServiceImpl implements UserService {
	
	private String INSERT_CONTACT_URL ="https://uncarried-hans-ungroupable.ngrok-free.dev/contact";
	
	private String GET_BY_ID_URL="https://uncarried-hans-ungroupable.ngrok-free.dev/contact/{id}";
	
	private String GET_ALL_CONTACTS_URL="https://uncarried-hans-ungroupable.ngrok-free.dev/contacts";
	
	private String UPDATE_CONTACT_URL="https://uncarried-hans-ungroupable.ngrok-free.dev/contact";
	
	private String DELETE_BY_ID_URL="https://uncarried-hans-ungroupable.ngrok-free.dev/contact/{id}";

	@Override
	public User upsertContact(Customer customer) {
	
	WebClient webClient = WebClient.create();
	  
	 User user   = webClient.post()
			                 .uri(INSERT_CONTACT_URL)
			                 .bodyValue(customer)
			                 .retrieve()
			                 .bodyToMono(User.class)
			                 .block();
	                   
		return user;
	}

	@Override
	public User getById(Integer id) {
		
	WebClient webClient = WebClient.create();
	                                
	User user = webClient.get()
	                     .uri(DELETE_BY_ID_URL, id)
	                     .retrieve()
	                     .bodyToMono(User.class)
	                     .block();
		
	return user;
	}

	@Override
	public List<User> getAllContacts() {
	
	WebClient webClient = WebClient.create();	
	
         return webClient.get()
			             .uri(GET_ALL_CONTACTS_URL)
			             .retrieve()
			             .bodyToFlux(User.class)   
			             .collectList() 
			             .block();// 
		
	}
	
	public User updateContact(Integer id) {
		
	WebClient webClient =	WebClient.create();
	
	  return webClient.get()
	                      .uri(UPDATE_CONTACT_URL)
	                      .retrieve()
	                      .bodyToMono(User.class)
	                      .block();
		
	}

	@Override
	public User deleteById(Integer id) {

	WebClient webClient = WebClient.create();
	   
	User user = webClient.get()
			             .uri(DELETE_BY_ID_URL, id)
			             .retrieve()
			             .bodyToMono(User.class)
			             .block();
		return user;
	}

}
