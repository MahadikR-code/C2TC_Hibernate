package com.tns.cg.smms.employee.repositories;

import com.tns.cg.smms.employee.entities.Employee;

public interface EmployeeRepository {
	/*
	 * Given Methods
	 */

	// addEmployee method for Create Operation
	public Employee addEmployee(Employee employee);

	// UpdateEmployee method for Update Employee details
	public Employee updateEmployee(Employee employee);

	// searchEmployee method for Retrieving employee from database
	public Employee searchEmployee(int id);

	// deleteEmployee method for Delete operation
	public boolean deleteEmployee(int id);

	// beginTrasaction method to start connection with database
	public abstract void beginTransaction();

	// commitTransaction method for persisting entries
	public abstract void commitTransaction();
}
