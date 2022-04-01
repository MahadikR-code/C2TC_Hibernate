package com.tns.cg.smms.repository;

import com.tns.cg.smms.entity.MallAdmin;

public interface IMallAdminRepository {
	/*
	 * Given methods
	 */
	public MallAdmin addMallAdmin(MallAdmin mallAdmin);

	public MallAdmin updateMallAdmin(MallAdmin mallAdmin);

	public MallAdmin deleteMallAdmin(int id);

	public MallAdmin searchMallAdmin(int id);

	public abstract void beginTransaction();

	public abstract void commitTransaction();
}
