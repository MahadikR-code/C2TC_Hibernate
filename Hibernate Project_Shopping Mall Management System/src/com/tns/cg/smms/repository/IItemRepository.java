package com.tns.cg.smms.repository;

import com.tns.cg.smms.entity.Item;

public interface IItemRepository {
	/*
	 * Given interface
	 */
	// add item
	public Item addItem(Item item);

	// update item
	public Item updateItem(Item item);

	// search item
	public Item searchItem(int id);

	// delete item
	public Item deleteItem(int id);

	public abstract void beginTransaction();

	public abstract void commitTransaction();
}
