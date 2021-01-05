package com.jdc.library.model.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

import lombok.Data;

@Entity
@Data
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String phone;
	private String email;
	private String address;
	@ManyToOne(optional = false)
	private MemberType type;
	private LocalDate registrationDate;
	
	@PrePersist
	private void prePersist() {
		registrationDate = LocalDate.now();
	}
}
