package com.tns.hibernate.inheritance.Table_per_class;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CONTRACT_EMPLOYEE")
public class ContractEmployee extends Employee {
	private static final long serialVersionUID = 1L;
	@Column(name = "TYPE")
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
