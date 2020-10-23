package com.jdc.jpa.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import lombok.Data;

@Data
public class InvoicePK implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "send_date")
	private Date inoviceDate;
	private int serialNumber;
}
