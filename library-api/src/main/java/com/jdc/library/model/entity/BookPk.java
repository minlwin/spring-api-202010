package com.jdc.library.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class BookPk implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "info_id")
	private int infoId;
	@Column(name = "serial_num")
	private int serialNum;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + infoId;
		result = prime * result + serialNum;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookPk other = (BookPk) obj;
		if (infoId != other.infoId)
			return false;
		if (serialNum != other.serialNum)
			return false;
		return true;
	}
	
	
}
