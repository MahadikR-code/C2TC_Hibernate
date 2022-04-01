package com.tns.cg.smms.repository;

import com.tns.cg.smms.entity.Mall;

public interface IMallRepository {
	/*
	 * Given methods
	 */
	public Mall addMall(Mall mall);

	public Mall updateMall(Mall mall);

	public Mall searchMall(int id);

	public boolean cancelMall(int id);

	public abstract void beginTransaction();

	public abstract void commitTransaction();
}
