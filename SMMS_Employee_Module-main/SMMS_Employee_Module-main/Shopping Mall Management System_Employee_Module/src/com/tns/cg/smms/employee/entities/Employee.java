package com.tns.cg.smms.employee.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	private int id;
	private String name;
	private LocalDate dob;
	private int salary;
	private String address;
	private String designation;

	// private Shop shop;

	/*
	 * Generating Getters and Setters for the fields
	 */

	// @return the id
	public int getId() {
		return id;
	}

	// setter method for @param id "id"
	public void setId(int id) {
		this.id = id;
	}

	// @return the name
	public String getName() {
		return name;
	}

	// setter method for @param id "name"
	public void setName(String name) {
		this.name = name;
	}

	// @return the "LocalDate"
	public LocalDate getDob() {
		return dob;
	}

	// setter @param id the "LocalDate"
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	// @return the "Salary"
	public float getSalary() {
		return salary;
	}

	// setter method for @param id the "salary"
	public void setSalary(int salary) {
		this.salary = salary;
	}

	// @return the "Address"
	public String getAddress() {
		return address;
	}

	// setter method for @param id the "address"
	public void setAddress(String address) {
		this.address = address;
	}

	// @return the "designation"
	public String getDesignation() {
		return designation;
	}

	// setter method for @param id the "designation"
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
