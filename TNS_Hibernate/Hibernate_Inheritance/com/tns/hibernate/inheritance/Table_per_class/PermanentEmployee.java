package com.tns.hibernate.inheritance.Table_per_class;
import javax.persistence.*;
@Entity
@Table(name = "PERMANENT_EMPLOYEE")
public class PermanentEmployee extends Employee{
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
