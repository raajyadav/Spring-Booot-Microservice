package com.jspider.service;

import java.util.List;

import com.jspider.binding.PhoneBook;

public interface PhoneBookService {

	public PhoneBook upsertContacts(PhoneBook phoneBook);

	public PhoneBook getById(Integer id);

	public List<PhoneBook> getAllContacts();

	public String deleteById(Integer id);

}
