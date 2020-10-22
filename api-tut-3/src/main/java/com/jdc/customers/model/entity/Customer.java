package com.jdc.customers.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer extends Account{
	
	@CollectionTable(name = "address")
	@ElementCollection
	private List<Address> addresses;
	
	public Customer() {
		addresses = new ArrayList<>();
		super.setRole(Role.Customer);
	}
	
}
