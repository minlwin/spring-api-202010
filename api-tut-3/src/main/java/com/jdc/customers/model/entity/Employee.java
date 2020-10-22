package com.jdc.customers.model.entity;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Employee extends Account{

	private LocalDate assignDate;
	private LocalDate resignDate;
	
	private Address address;
}
