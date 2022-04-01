package com.tns.cg.smms.service;

import com.tns.cg.smms.entity.Shop;
import com.tns.cg.smms.entity.User;
import com.tns.cg.smms.repository.IShopRepository;
import com.tns.cg.smms.repository.IShopRepositoryImpl;
import com.tns.cg.smms.repository.IUserRepository;
import com.tns.cg.smms.repository.IUserRepositoryImpl;

public class IAdminServiceImpl implements IAdminService {
	// Establishing connection between Service and Repository
	private IShopRepository dao;
	private IUserRepository cao;

	// creating constructor
	public IAdminServiceImpl() {
		dao = new IShopRepositoryImpl();
		cao = new IUserRepositoryImpl();

	}

	// Implenting methods from the repository

	@Override
	public boolean approveNewShop(Shop shop) {
		dao.beginTransaction();
		dao.addShop(shop);
		dao.commitTransaction();
		return true;
	}

	@Override
	public User updateUser(User user) {
		cao.beginTransaction();
		cao.updateUser(user);
		cao.commitTransaction();
		return user;
	}

}
