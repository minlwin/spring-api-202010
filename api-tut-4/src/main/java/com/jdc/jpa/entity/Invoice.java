package com.jdc.jpa.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import lombok.Data;

@Entity
@IdClass(InvoicePK.class)
@Data
public class Invoice implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private Date inoviceDate;
	@Id
	private int serialNumber;
	
	private String customerName;
	private int amount;
	private String reason;
}
