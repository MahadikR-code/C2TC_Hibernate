package com.tns.cg.smms.repository;

import com.tns.cg.smms.entity.User;

public interface IUserRepository {
	/*
	 * Given Methods
	 */
	public User addUser(User user);

	public User updateUser(User user);

	public User searchUser(int id);

	public User deleteUser(int id);

	public abstract void beginTransaction();

	public abstract void commitTransaction();

}
