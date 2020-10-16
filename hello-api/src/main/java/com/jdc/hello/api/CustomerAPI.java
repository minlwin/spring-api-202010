package com.jdc.hello.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.hello.model.CustomerRepo;
import com.jdc.hello.model.entity.Customer;

@RestController
@RequestMapping("customers")
public class CustomerAPI {
	
	@Autowired
	private CustomerRepo repo;

	@GetMapping
	public List<Customer> getAll() {
		return repo.findAll();
	}
	
	@PostMapping
	public Customer create(@RequestBody Customer c) {
		return repo.save(c);
	}
}
