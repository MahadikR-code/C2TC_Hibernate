package com.tns.cg.smms.service;

import com.tns.cg.smms.entity.Employee;
import com.tns.cg.smms.entity.Item;
import com.tns.cg.smms.entity.Shop;
import com.tns.cg.smms.repository.IEmployeeRepository;
import com.tns.cg.smms.repository.IEmployeeRepositoryImpl;
import com.tns.cg.smms.repository.IItemRepository;
import com.tns.cg.smms.repository.IItemRepositoryImpl;
import com.tns.cg.smms.repository.IShopRepository;
import com.tns.cg.smms.repository.IShopRepositoryImpl;

public class IShopServiceImpl implements IShopService {

	// Establishing connection wuth repositories
	private IShopRepository dao;
	private IEmployeeRepository cao;
	private IItemRepository bao;

	// creating constructor
	public IShopServiceImpl() {
		dao = new IShopRepositoryImpl();
		cao = new IEmployeeRepositoryImpl();
		bao = new IItemRepositoryImpl();
	}

	// Implementation of methods from interface
	@Override
	public Shop addShop(Shop shop) {
		dao.beginTransaction();
		dao.addShop(shop);
		dao.commitTransaction();
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) {
		dao.beginTransaction();
		dao.updateShop(shop);
		dao.commitTransaction();
		return shop;
	}

	@Override
	public Shop searchShopById(int id) {
		Shop shop = dao.searchShopById(id);
		return shop;
	}

	@Override
	public boolean deleteShop(int id) {
		dao.beginTransaction();
		dao.deleteShop(id);
		dao.commitTransaction();
		return false;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		cao.beginTransaction();
		cao.addEmployee(employee);
		cao.commitTransaction();
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		cao.beginTransaction();
		cao.updateEmployee(employee);
		cao.commitTransaction();
		return true;
	}

	@Override
	public Item addItem(Item item) {
		bao.beginTransaction();
		bao.addItem(item);
		bao.commitTransaction();
		return item;
	}

}
