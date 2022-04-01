package com.tns.cg.smms.repository;

import com.tns.cg.smms.entity.ShopOwner;

public interface IShopOwnerRepository {
	/*
	 * Given methods
	 */
	public ShopOwner addShopOwner(ShopOwner shopOwner);

	public ShopOwner updateShopOwner(ShopOwner shopOwner);

	public ShopOwner searchShopOwner(int id);

	public ShopOwner deleteShopOwner(int id);

	public abstract void beginTransaction();

	public abstract void commitTransaction();

}
