package com.jdc.customers.model.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "cust_customer")
@TableGenerator(name = "cust_id_gen", allocationSize = 1)
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "cust_id_gen")
	private int id;
	private String name;
	@Column(unique = true, nullable = false,  name = "login_email")
	private String email;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "reg_date")
	private Date registrationDate;
	
	@Temporal(TemporalType.TIME)
	@Column(name = "reg_time")
	private Date registTime;
	
	private LocalDate dob;
	
	@Lob
	private String remark;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	public enum Gender {
		Male, Female
	}
}
