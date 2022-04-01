package com.tns.cg.smms.service;

import com.tns.cg.smms.entity.Employee;
import com.tns.cg.smms.entity.Item;
import com.tns.cg.smms.entity.Shop;

public interface IShopService {
	/*
	 * Given Methods
	 */

	// method to add shop
	public Shop addShop(Shop shop);

	// method to update shop
	public Shop updateShop(Shop shop);

	// method to search shop
	public Shop searchShopById(int id);

	// method to delete shop
	public boolean deleteShop(int id);

	// method to add employee
	public boolean addEmployee(Employee employee);

	// method to update employee
	public boolean updateEmployee(Employee employee);

	// method to add item
	public Item addItem(Item item);
}
