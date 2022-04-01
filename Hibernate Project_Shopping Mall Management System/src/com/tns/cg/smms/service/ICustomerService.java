package com.tns.cg.smms.service;

import com.tns.cg.smms.entity.Customer;
import com.tns.cg.smms.entity.Item;
import com.tns.cg.smms.entity.Mall;

public interface ICustomerService {
	/*
	 * Given methods
	 */
	// Method to add customer
	public Customer addCustomer(Customer customer);

	// Method to update customer
	public Customer updateCustomer(Customer customer);

	// Method to search customer
	public Customer searchCustomer(int id);

	// method to delete customer
	public Customer deleteCustomer(int id);

	// method to search item
	public Item searchItem(int id);

	// method to add item
	public Item addItem(Item item);

	// method to search mall
	public Mall searchMall(int id);

	// method to delete order
	public boolean deleteOrder(int id);

//public User login(User user);
//public boolean logout();
}
