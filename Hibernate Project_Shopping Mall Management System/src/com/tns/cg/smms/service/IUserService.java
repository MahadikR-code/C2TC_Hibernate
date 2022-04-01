package com.tns.cg.smms.service;

import com.tns.cg.smms.entity.User;

public interface IUserService {
	/*
	 * given methods
	 */

	// method to add user
	public User addUser(User user);

	// method to search user
	public User searchUser(int id);

	// method to update user
	public User updateUser(User user);
}
