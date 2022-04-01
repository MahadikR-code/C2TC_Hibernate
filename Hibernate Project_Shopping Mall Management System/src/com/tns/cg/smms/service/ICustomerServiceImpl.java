package com.tns.cg.smms.service;

import com.tns.cg.smms.entity.Customer;
import com.tns.cg.smms.entity.Item;
import com.tns.cg.smms.entity.Mall;
import com.tns.cg.smms.repository.ICustomerRepository;
import com.tns.cg.smms.repository.ICustomerRepositoryImpl;
import com.tns.cg.smms.repository.IItemRepository;
import com.tns.cg.smms.repository.IItemRepositoryImpl;
import com.tns.cg.smms.repository.IMallRepository;
import com.tns.cg.smms.repository.IMallRepositoryImpl;
import com.tns.cg.smms.repository.IOrderRepository;
import com.tns.cg.smms.repository.IOrderrepositoryImpl;

public class ICustomerServiceImpl implements ICustomerService {

	// starting connection with repositories
	private ICustomerRepository dao;
	private IItemRepository cao;
	private IOrderRepository bao;
	private IMallRepository gao;

	// creating constructor
	public ICustomerServiceImpl() {
		dao = new ICustomerRepositoryImpl();
		cao = new IItemRepositoryImpl();
		bao = new IOrderrepositoryImpl();
		gao = new IMallRepositoryImpl();
	}

	// Implementing methods from inteface
	@Override
	public Item addItem(Item item) {
		cao.beginTransaction();
		cao.addItem(item);
		cao.commitTransaction();
		return item;
	}

	@Override
	public Item searchItem(int id) {
		Item item = cao.searchItem(id);
		return item;
	}

	@Override
	public Mall searchMall(int id) {
		Mall mall = gao.searchMall(id);
		return mall;
	}

	@Override
	public boolean deleteOrder(int id) {
		bao.beginTransaction();
		bao.deleteOrder(id);
		bao.commitTransaction();
		return false;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		dao.beginTransaction();
		dao.addCustomer(customer);
		dao.commitTransaction();
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		dao.beginTransaction();
		dao.updateCustomer(customer);
		dao.commitTransaction();
		return customer;
	}

	@Override
	public Customer searchCustomer(int id) {
		Customer customer = dao.searchCustomer(id);
		return customer;
	}

	@Override
	public Customer deleteCustomer(int id) {
		dao.beginTransaction();
		dao.deleteCustomer(id);
		dao.commitTransaction();
		return null;
	}
}
