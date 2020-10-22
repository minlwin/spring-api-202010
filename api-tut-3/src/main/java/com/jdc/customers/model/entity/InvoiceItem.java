package com.jdc.customers.model.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class InvoiceItem {

	@EmbeddedId
	private InvoiceItemPK id;
	
	@ManyToOne(optional = false)
	@JoinColumn(insertable = false, updatable = false)
	private Product product;
	
	@ManyToOne(optional = false)
	@JoinColumns({
		@JoinColumn(name = "invoice_date", insertable = false, updatable = false),
		@JoinColumn(name = "invoice_time", insertable = false, updatable = false),
		@JoinColumn(name = "cusotomer_id", insertable = false, updatable = false),
	})
	private Invoice invoice;
	private int quentity;
	private int price;
}
