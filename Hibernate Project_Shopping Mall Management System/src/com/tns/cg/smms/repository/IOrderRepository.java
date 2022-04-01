package com.tns.cg.smms.repository;

import com.tns.cg.smms.entity.OrderDetails;

public interface IOrderRepository {
	/*
	 * Given Methods
	 */
	public OrderDetails addOrder(OrderDetails order);

	public OrderDetails updateOrder(OrderDetails order);

	public OrderDetails searchOrder(int id);

	public OrderDetails deleteOrder(int id);

	public abstract void beginTransaction();

	public abstract void commitTransaction();
}
