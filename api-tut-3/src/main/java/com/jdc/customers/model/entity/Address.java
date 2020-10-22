package com.jdc.customers.model.entity;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class Address {

	private String street;
	private String building;
	private String township;
	private String division;
}
