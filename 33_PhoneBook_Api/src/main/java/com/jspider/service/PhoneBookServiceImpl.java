package com.jspider.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.binding.PhoneBook;
import com.jspider.repository.PhoneBookRepository;

@Service
public class PhoneBookServiceImpl implements PhoneBookService {

	@Autowired
	private PhoneBookRepository repository;

	@Override
	public PhoneBook upsertContacts(PhoneBook phoneBook) {
	    PhoneBook saved = repository.save(phoneBook);
	    return saved;  // return full JSON
	}


	@Override
	public PhoneBook getById(Integer id) {
		Optional<PhoneBook> findById = repository.findById(id);

		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<PhoneBook> getAllContacts() {
		return repository.findAll();
	}

	@Override
	public String deleteById(Integer id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return "Delete Success";
		} else {
			return "No Record Found";
		}

	}

}
