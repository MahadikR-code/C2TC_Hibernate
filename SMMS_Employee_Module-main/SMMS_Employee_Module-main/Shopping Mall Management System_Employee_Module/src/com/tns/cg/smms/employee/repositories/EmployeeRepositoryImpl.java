package com.tns.cg.smms.employee.repositories;

import javax.persistence.EntityManager;

import com.tns.cg.smms.employee.entities.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	private EntityManager entitymanager;

	// step 1: starting of JPA life cycle
	public EmployeeRepositoryImpl() {
		entitymanager = JPAUtil.getEntityManager();
	}

	// step 2: Overriding methods from EmployeeRepository

	// i) Create Operation in repository
	@Override
	public Employee addEmployee(Employee employee) {
		entitymanager.persist(employee);
		return employee;
	}

	// ii) update operation in repository
	@Override
	public Employee updateEmployee(Employee employee) {
		entitymanager.merge(employee);
		return employee;
	}

	// iii) Search operation in repository
	@Override
	public Employee searchEmployee(int id) {
		Employee employee = entitymanager.find(Employee.class, id);
		return employee;
	}

	// iv) Delete operation in repository
	@Override
	public boolean deleteEmployee(int id) {
		Employee employee = entitymanager.find(Employee.class, id);
		entitymanager.remove(employee);
		return false;
	}

	@Override
	public void beginTransaction() {
		entitymanager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entitymanager.getTransaction().commit();
	}

}