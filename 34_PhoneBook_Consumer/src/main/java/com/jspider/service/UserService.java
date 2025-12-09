package com.jspider.service;

import java.util.List;

import com.jspider.request.Customer;
import com.jspider.response.User;

public interface UserService {

	public User upsertContact(Customer customer);
	
	public User getById(Integer id);
	
	public List<User> getAllContacts();
	
	public User deleteById(Integer id);
	
}
