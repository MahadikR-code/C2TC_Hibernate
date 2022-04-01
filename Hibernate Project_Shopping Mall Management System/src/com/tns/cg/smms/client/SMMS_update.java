package com.tns.cg.smms.client;

import java.time.LocalDate;

import com.tns.cg.smms.entity.Customer;
import com.tns.cg.smms.entity.Employee;
import com.tns.cg.smms.entity.OrderDetails;
import com.tns.cg.smms.entity.Shop;
import com.tns.cg.smms.entity.ShopOwner;
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

public class SMMS_update {
	public static void main(String[] args) {

		ICustomerService c_service = new ICustomerServiceImpl();
		IEmployeeService e_service = new IEmployeeServiceImpl();
		IOrderService o_service = new IOrderServiceImpl();
		IShopService s_service = new IShopServiceImpl();
		IUserService u_service = new IUserServiceImpl();

		// Update Shops
		Shop shop1 = new Shop();
		shop1.setShopId(9);
		shop1.setShopName("Books");
		shop1.setShopCategory(" ");
		shop1.setShopStatus("Open");
		shop1.setLeaseStatus(null);
		s_service.updateShop(shop1);

		// Update customer
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setName("Raj");
		customer1.setPhone("112233445566");
		customer1.setEmail("abc@gmail.com");
		shop1.setCustomers("customer1");
		c_service.updateCustomer(customer1);

		// Update Employee
		Employee employee1 = new Employee();
		employee1.setId(10);
		employee1.setName("Ashish");
		employee1.setAddress("Mumbai");
		employee1.setDob(LocalDate.of(1998, 10, 10));
		employee1.setDesignation("Employee");
		employee1.setSalary(10000);
		e_service.updateEmployee(employee1);

		// Update oders
		OrderDetails order1 = new OrderDetails();
		order1.setCustomer_id(customer1);
		order1.setDateOfPurchase(LocalDate.of(2022, 10, 3));
		order1.setId(50);
		order1.setPaymentMode("Cash");
		order1.setTotal(100);
		o_service.updateOrder(order1);

		// Update Shop Owners
		ShopOwner shopowner1 = new ShopOwner();
		shopowner1.setId(40);
		shopowner1.setName("Rohit");
		shopowner1.setAddress("Maharashtra");
		shopowner1.setDob(LocalDate.of(1098, 10, 8));

		// Update Users
		User user1 = new User();
		user1.setId(45);
		user1.setName("Murli");
		user1.setType("ShopOwner");
		user1.setPassword("Ojha800");
		shopowner1.setUser_ID(user1);
		u_service.updateUser(user1);
	}
}
