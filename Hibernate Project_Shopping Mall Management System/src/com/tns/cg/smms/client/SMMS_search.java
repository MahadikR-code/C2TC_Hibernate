package com.tns.cg.smms.client;

import com.tns.cg.smms.entity.Customer;
import com.tns.cg.smms.entity.Employee;
import com.tns.cg.smms.entity.Item;
import com.tns.cg.smms.entity.OrderDetails;
import com.tns.cg.smms.entity.Shop;
import com.tns.cg.smms.entity.User;
import com.tns.cg.smms.service.ICustomerService;
import com.tns.cg.smms.service.ICustomerServiceImpl;
import com.tns.cg.smms.service.IEmployeeService;
import com.tns.cg.smms.service.IEmployeeServiceImpl;
import com.tns.cg.smms.service.IOrderService;
import com.tns.cg.smms.service.IOrderServiceImpl;
import com.tns.cg.smms.service.IShopService;
import com.tns.cg.smms.service.IShopServiceImpl;
import com.tns.cg.smms.service.IUserService;
import com.tns.cg.smms.service.IUserServiceImpl;

public class SMMS_search {
	public static void main(String[] args) {

		// Invoking Services
		ICustomerService c_service = new ICustomerServiceImpl();
		IEmployeeService e_service = new IEmployeeServiceImpl();
		IOrderService o_service = new IOrderServiceImpl();
		IShopService s_service = new IShopServiceImpl();
		IUserService u_service = new IUserServiceImpl();

		// searching customer
		Customer customer = new Customer();
		customer = c_service.searchCustomer(0);
		System.out.println("Customer found: " + "ID" + customer.getId() + "Name: " + customer.getName());

		// Searching employee
		Employee employee = new Employee();
		employee = e_service.searchEmployee(0);
		System.out.println("Employee Found: " + "ID: " + employee.getId() + "Name: " + employee.getName());

		// searching Item
		Item item = new Item();
		item = c_service.searchItem(0);
		System.out.println("Item Found: " + "ID: " + item.getId() + "Name: " + item.getItemName());

		// searching item
		Shop shop = new Shop();
		shop = s_service.searchShopById(0);
		System.out.println("Shop Found:" + "Shop Id: " + shop.getShopId() + "Shop Name: " + shop.getShopName());

		// searching order
		OrderDetails orderdetails = new OrderDetails();
		orderdetails = o_service.searchOrder(0);
		System.out.println("Order Found: " + orderdetails.getId() + orderdetails.getDateOfPurchase());

		// searching user
		User user = new User();
		user = u_service.searchUser(0);
		System.out.println("User Found: " + " User Id:" + user.getId() + user.getName());
	}
}
