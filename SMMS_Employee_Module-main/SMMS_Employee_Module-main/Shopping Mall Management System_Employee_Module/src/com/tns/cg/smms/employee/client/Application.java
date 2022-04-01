package com.tns.cg.smms.employee.client;

import java.time.LocalDate;

import com.tns.cg.smms.employee.entities.Employee;
import com.tns.cg.smms.employee.services.EmployeeService;
import com.tns.cg.smms.employee.services.EmployeeServiceImpl;

public class Application {
	public static void main(String[] args) {

		// step 1. CRUD operation calling
		Employee employee = new Employee();
		EmployeeService service = new EmployeeServiceImpl();

		// step 2. Implentation of crud operations

		// Operation 1. Add Emplyee in Database
		// Creating new Employee "Rohit"

		employee.setId(101);
		employee.setName("Rohit");
		employee.setSalary(100000);
		employee.setAddress("Maharashtra");
		employee.setDesignation("Manager");
		employee.setDob(LocalDate.of(1998, 12, 11));
		service.addEmployee(employee);

		// Operation 2. Update Employee information from database
		// Updating Employee details....

		employee = service.searchEmployee(101);
		employee.setName("Rohit Mahadik");
		employee.setSalary(50000);
		employee.setAddress("Mumbai");
		employee.setDesignation("CEO");
		employee.setDob(LocalDate.of(1998, 11, 12));
		service.updateEmployee(employee);

		// Operation 3. Search Employee From database
		// Searching (retrieving) Employee Details.....

		employee = service.searchEmployee(101);
		System.out.println(
				"Employee Found: " + "ID: " + employee.getId() + "\n" + "Employee Name: " + employee.getName());

		// Operation 4. Remove Employee details from database
		// Deleting employee details
		employee = service.searchEmployee(101);
		service.deleteEmployee(101);

		System.out.println("Operation Performed suceesfully");
	}
}
