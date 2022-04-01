package com.tns.cg.smms.service;

import com.tns.cg.smms.entity.Employee;
import com.tns.cg.smms.repository.IEmployeeRepository;
import com.tns.cg.smms.repository.IEmployeeRepositoryImpl;

public class IEmployeeServiceImpl implements IEmployeeService {
	// Establishing connection between Service and Repository
	private IEmployeeRepository dao;

	// creating constructor
	public IEmployeeServiceImpl() {
		dao = new IEmployeeRepositoryImpl();

	}

	// implementing methods from interface
	@Override
	public Employee addEmployee(Employee employee) {
		dao.beginTransaction();
		dao.addEmployee(employee);
		dao.commitTransaction();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
		return employee;
	}

	@Override
	public Employee searchEmployee(int id) {
		Employee employee = dao.searchEmployee(id);
		return employee;
	}

	@Override
	public boolean deleteEmployee(int id) {
		dao.beginTransaction();
		dao.deleteEmployee(id);
		dao.commitTransaction();
		return false;
	}

}
