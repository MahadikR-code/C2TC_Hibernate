package com.tns.cg.smms.employee.services;

import com.tns.cg.smms.employee.entities.Employee;

public interface EmployeeService {
	/*
	 * Given methods in the IEmployeeService Interface
	 */
	// Add Employee
	public Employee addEmployee(Employee employee);

	// Update Employee
	public Employee updateEmployee(Employee employee);

	// Retrieve Employee
	public Employee searchEmployee(int id);

	// Delete Employee
	public boolean deleteEmployee(int id);

}
