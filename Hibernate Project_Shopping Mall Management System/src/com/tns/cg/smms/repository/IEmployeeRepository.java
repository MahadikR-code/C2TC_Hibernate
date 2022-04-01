package com.tns.cg.smms.repository;

import com.tns.cg.smms.entity.Employee;

public interface IEmployeeRepository {
	/*
	 * given methods
	 */

	// add employee
	public Employee addEmployee(Employee employee);

	// update employee
	public Employee updateEmployee(Employee employee);

	// search employee
	public Employee searchEmployee(int id);

	// delete employee
	public boolean deleteEmployee(int id);

	public abstract void beginTransaction();

	public abstract void commitTransaction();
}
