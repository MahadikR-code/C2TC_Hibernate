package com.tns.cg.smms.service;

import com.tns.cg.smms.entity.Shop;
import com.tns.cg.smms.entity.User;

public interface IAdminService {
	/*
	 * Given Methods
	 */

	// Method for shop approval ( adding new shop)
	public boolean approveNewShop(Shop shop);

	// Method for update user details
	public User updateUser(User user);
	// public User login(User user);
	// public boolean logOut();
}
