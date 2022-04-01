package com.tns.cg.smms.service;

import com.tns.cg.smms.entity.Employee;

public interface IEmployeeService {
	/*
	 * Given Methods
	 */

	// Method to add employee
	public Employee addEmployee(Employee employee);

	// method to update employee
	public Employee updateEmployee(Employee employee);

	// method to search employee
	public Employee searchEmployee(int id);

	// method to delete employee
	public boolean deleteEmployee(int id);

}
