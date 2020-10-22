package com.jdc.customers.model.entity;

import java.time.LocalDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Invoice {

	@EmbeddedId
	private InovicePK id;
	private LocalDateTime statusChangedTime;
	@ManyToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "id",  insertable = false, updatable = false)
	private Customer customer;
	private Status status;
	private int subTotal;
	private int tax;
	private int deliveryCharges;
	
	
	public enum Status {
		Order, Canceled, Finished
	}
}
