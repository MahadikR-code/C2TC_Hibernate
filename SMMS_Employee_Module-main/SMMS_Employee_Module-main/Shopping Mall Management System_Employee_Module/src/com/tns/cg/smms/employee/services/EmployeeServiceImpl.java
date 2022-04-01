package com.tns.cg.smms.employee.services;

import com.tns.cg.smms.employee.entities.Employee;
import com.tns.cg.smms.employee.repositories.EmployeeRepository;
import com.tns.cg.smms.employee.repositories.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {

	// Step 1. Creating Connection with repository
	private EmployeeRepository dao;

	public EmployeeServiceImpl() {
		dao = new EmployeeRepositoryImpl();
	}

	// Step 2. Service calls to perform CRUD operations

	// Create Operation
	@Override
	public Employee addEmployee(Employee employee) {
		dao.beginTransaction();
		dao.addEmployee(employee);
		dao.commitTransaction();
		return employee;
	}

	// Update Operation
	@Override
	public Employee updateEmployee(Employee employee) {
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
		return employee;
	}

	// Search Operation
	@Override
	public Employee searchEmployee(int id) {
		Employee employee = dao.searchEmployee(id);
		return employee;
	}

	// Delete Operation
	@Override
	public boolean deleteEmployee(int id) {
		dao.beginTransaction();
		dao.deleteEmployee(id);
		dao.commitTransaction();
		return false;
	}

}