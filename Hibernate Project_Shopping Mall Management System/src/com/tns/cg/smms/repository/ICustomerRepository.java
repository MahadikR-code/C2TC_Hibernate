package com.tns.cg.smms.repository;

import com.tns.cg.smms.entity.Customer;

public interface ICustomerRepository {
	/*
	 * Given Methods
	 */

	// method for creating customer
	public Customer addCustomer(Customer customer);

	// method for update customer
	public Customer updateCustomer(Customer customer);

	// method for searching customer
	public Customer searchCustomer(int id);

	// method for delete customer
	public Customer deleteCustomer(int id);

	// method for begin transaction
	public abstract void beginTransaction();

	// method for commiting transaction
	public abstract void commitTransaction();

}
