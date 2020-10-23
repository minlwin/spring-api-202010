package com.jdc.jpa.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Student implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	private String name;
	private BigInteger balance;
	@Temporal(TemporalType.DATE)
	private Calendar dob;
	private BigDecimal rate;
	
	private Address primaryAddress;
	
	private Parent father;
	private Parent mother;
	
	@CollectionTable(name = "interestest")
	@ElementCollection
	private List<String> interestest;
	
	@ElementCollection
	private List<Address> secondaryAddresses;
}
