package com.tns.cg.smms.service;

import com.tns.cg.smms.entity.Item;
import com.tns.cg.smms.entity.OrderDetails;
import com.tns.cg.smms.repository.IItemRepository;
import com.tns.cg.smms.repository.IItemRepositoryImpl;
import com.tns.cg.smms.repository.IMallRepository;
import com.tns.cg.smms.repository.IMallRepositoryImpl;
import com.tns.cg.smms.repository.IOrderRepository;
import com.tns.cg.smms.repository.IOrderrepositoryImpl;

public class IOrderServiceImpl implements IOrderService

// Step 1: Establishing Connection between service and repository file

{
	private IOrderRepository dao;
	private IMallRepository cao;
	private IItemRepository bao;

	// creating constructor
	public IOrderServiceImpl() {
		dao = new IOrderrepositoryImpl();
		cao = new IMallRepositoryImpl();
		bao = new IItemRepositoryImpl();
	}

// Step 2: Service calls to perform CRUD Operation	

	@Override
	public OrderDetails addOrder(OrderDetails order) {
		dao.beginTransaction();
		dao.addOrder(order);
		dao.commitTransaction();
		return order;
	}

	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		dao.beginTransaction();
		dao.updateOrder(order);
		dao.commitTransaction();
		return order;
	}

	@Override
	public OrderDetails searchOrder(int id) {
		OrderDetails order = dao.searchOrder(id);
		return order;
	}

	@Override
	public boolean cancelMall(int id) {
		cao.beginTransaction();
		cao.cancelMall(id);
		cao.commitTransaction();
		return false;
	}

	@Override
	public Item addItem(Item item) {
		bao.beginTransaction();
		bao.addItem(item);
		bao.commitTransaction();
		return item;
	}

}
