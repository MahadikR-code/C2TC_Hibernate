package com.tns.cg.smms.repository;

import com.tns.cg.smms.entity.Shop;

public interface IShopRepository {
	/*
	 * Given Methods
	 */
	public Shop addShop(Shop shop);

	public Shop updateShop(Shop shop);

	public Shop searchShopById(int id);

	public boolean deleteShop(int id);

	public abstract void beginTransaction();

	public abstract void commitTransaction();

}
