package com.jdc.library.model.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String penName;
	@Column(nullable = false)
	private String name;
	private Gender gender;
	private String country;
	private LocalDate dateOfBirth;
	private String jobTitle;
	
	public enum Gender {
		Male, Female
	}
}
