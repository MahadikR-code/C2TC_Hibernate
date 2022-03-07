package com.tns.hibernate.inheritance.Table_per_class;
import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="EMPLOYEE")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.TABLE)

@Column(name = "Emp_ID")
private int empId;

@Column(name = "name")
private String name;

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
