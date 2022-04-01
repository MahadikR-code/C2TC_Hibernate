package com.tns.cg.smms.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "shop")

public class Shop implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int shopId;
	private String shopCategory;
	private String shopName;
	private String customers;
	private String shopStatus;
	private String leaseStatus;

//Mapping
	@OneToMany(mappedBy = "shop")
	private List<Employee> shopEmployeeID;

	@OneToMany(mappedBy = "shopID")
	private List<Item> itemID;

//GETTER & SETTER for fields

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public List<Employee> getShopEmployeeID() {
		return shopEmployeeID;
	}

	public void setShopEmployeeID(List<Employee> shopEmployeeID) {
		this.shopEmployeeID = shopEmployeeID;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public String getLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

	public List<Item> getItemID() {
		return itemID;
	}

	public void setItemID(List<Item> itemID) {
		this.itemID = itemID;
	}

}
