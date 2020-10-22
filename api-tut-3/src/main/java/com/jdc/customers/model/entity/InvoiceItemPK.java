package com.jdc.customers.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class InvoiceItemPK implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "invoice_date")
	private LocalDate invoiceDate;
	@Column(name = "invoice_time")
	private LocalTime invoiceTime;
	@Column(name = "customer_id")
	private int customerId;
	@Column(name = "product_id")
	private int productId;
	
}
