package com.tns.cg.smms.service;

import com.tns.cg.smms.entity.User;
import com.tns.cg.smms.repository.IUserRepository;
import com.tns.cg.smms.repository.IUserRepositoryImpl;

public class IUserServiceImpl implements IUserService {

	// Establishing connection with repository
	private IUserRepository dao;

	// creating constructor
	public IUserServiceImpl() {
		dao = new IUserRepositoryImpl();
	}

	// implementing methods from interface
	@Override
	public User addUser(User user) {
		dao.beginTransaction();
		dao.addUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User searchUser(int id) {
		User user = dao.searchUser(id);
		return user;
	}

}
