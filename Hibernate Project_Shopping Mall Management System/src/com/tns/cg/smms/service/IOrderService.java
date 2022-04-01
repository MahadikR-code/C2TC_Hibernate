package com.tns.cg.smms.service;

import com.tns.cg.smms.entity.Item;
import com.tns.cg.smms.entity.OrderDetails;

public interface IOrderService {
	/*
	 * Given Methods
	 */

	// method to add order
	public OrderDetails addOrder(OrderDetails order);

	// method tp update order
	public OrderDetails updateOrder(OrderDetails order);

	// method to search order
	public OrderDetails searchOrder(int id);

	// method to cancle mall
	public boolean cancelMall(int id);

	// method to add item
	public Item addItem(Item item);

}
