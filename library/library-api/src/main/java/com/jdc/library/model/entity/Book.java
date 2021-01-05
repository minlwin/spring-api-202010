package com.jdc.library.model.entity;

import java.time.LocalDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity 
public class Book {

	@EmbeddedId
	private BookPk id;
	@ManyToOne(optional = false)
	@JoinColumn(name = "info_id", insertable = false, updatable = false)
	private BookInfo info;
	private LocalDate registrationDate;
	private Status status;
	
	
	public enum Status {
		Avaliable, Lost, Damage
	}
}
