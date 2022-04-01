package com.tns.cg.smms.client;

import java.time.LocalDate;

import com.tns.cg.smms.entity.Customer;
import com.tns.cg.smms.entity.Employee;
import com.tns.cg.smms.entity.Item;
import com.tns.cg.smms.entity.Mall;
import com.tns.cg.smms.entity.MallAdmin;
import com.tns.cg.smms.entity.OrderDetails;
import com.tns.cg.smms.entity.Shop;
import com.tns.cg.smms.entity.ShopOwner;
import com.tns.cg.smms.entity.User;
import com.tns.cg.smms.service.IAdminService;
import com.tns.cg.smms.service.IAdminServiceImpl;
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

public class SMMS_Create {
	public static void main(String[] args) {

		IAdminService a_service = new IAdminServiceImpl();
		ICustomerService c_service = new ICustomerServiceImpl();
		IEmployeeService e_service = new IEmployeeServiceImpl();
		IOrderService o_service = new IOrderServiceImpl();
		IShopService s_service = new IShopServiceImpl();
		IUserService u_service = new IUserServiceImpl();

		// Creating Shops
		Shop shop1 = new Shop();
		// shop1.setShopId(349);
		shop1.setShopName("Book2");
		shop1.setShopCategory("dscsafchfj");
		shop1.setShopStatus("Open");
		shop1.setLeaseStatus(null);
		s_service.addShop(shop1);

		Shop shop2 = new Shop();
		// shop2.setShopId(32);
		shop2.setShopName("vadapao");
		shop2.setShopCategory("fsfddhf");
		shop2.setShopStatus("Close");
		shop2.setLeaseStatus(null);
		s_service.addShop(shop2);

//		// Creating customers
		Customer customer1 = new Customer();
		// customer1.setId(31);
		customer1.setName("Raj");
		customer1.setPhone("112233445566");
		customer1.setEmail("abc@gmail.com");
		shop1.setCustomers("customer1");
		c_service.addCustomer(customer1);

		Customer customer2 = new Customer();
		// customer1.setId(21);
		customer1.setName("Puja shinde");
		customer1.setPhone("123456789");
		customer1.setEmail("xyz@gmail.com");
		shop2.setCustomers("customer2");
		c_service.addCustomer(customer2);

		// Creating Employees
		Employee employee1 = new Employee();
		// employee1.setId(789);
		employee1.setName("Akshay");
		employee1.setAddress("Mumbai");
		employee1.setDob(LocalDate.of(1998, 10, 10));
		employee1.setDesignation("Employee");
		employee1.setSalary(10000);
		e_service.addEmployee(employee1);

		Employee employee2 = new Employee();
		// employee2.setId(111);
		employee2.setName("dipali ");
		employee2.setAddress("Pune");
		employee2.setDob(LocalDate.of(1996, 7, 11));
		employee2.setDesignation("Employee");
		employee2.setSalary(10000);
		e_service.addEmployee(employee2);

		// Creating Items
		Item item1 = new Item();
		// item1.setId(1001);
		item1.setItemName("Pizza");
		item1.setPrice(100);
		item1.setCategory(" ");
		item1.setExpiry(LocalDate.of(2024, 1, 10));
		item1.setManufacturingDate(LocalDate.of(2022, 10, 10));
		item1.setShopID(shop2);
		s_service.addItem(item1);

		Item item2 = new Item();
//		item2.setId(2001);
		item2.setItemName("abcd");
		item2.setPrice(1000);
		item2.setCategory("Comic Book");
		item2.setExpiry(null);
		item2.setManufacturingDate(null);
		item2.setShopID(shop1);
		s_service.addItem(item2);

		// Creating Mall
		Mall mall = new Mall();
		mall.setCategories("");
		// mall.setId(1011);
		mall.setLocation("Mumabi");
		mall.setMallName("CTC");

		// Creating MallAdmin
		MallAdmin malladmin = new MallAdmin();
		// malladmin.setId(5010);
		malladmin.setMall(mall);
		malladmin.setName("Ratnakar");
		malladmin.setPassword("acxxhs");
		malladmin.setPhone("154678913");
		mall.setMallAdmin(malladmin);

		// Creating oders
		OrderDetails order1 = new OrderDetails();
		order1.setCustomer_id(customer1);
		order1.setDateOfPurchase(LocalDate.of(2022, 10, 3));
		// order1.setId(504);
		order1.setPaymentMode("Cash");
		order1.setTotal(100);
		o_service.addItem(item2);
		o_service.addOrder(order1);

		OrderDetails order2 = new OrderDetails();
		order2.setCustomer_id(customer2);
		order2.setDateOfPurchase(LocalDate.of(2021, 10, 10));
//		order2.setId(180);
		order2.setPaymentMode("Card");
		order2.setTotal(5);
		o_service.addOrder(order2);

		// Creating Shop Owners
		ShopOwner shopowner1 = new ShopOwner();
//		shopowner1.setId(406);
		shopowner1.setName("Rohit");
		shopowner1.setAddress("Maharashtra");
		shopowner1.setDob(LocalDate.of(1098, 10, 8));
		shopowner1.setMalladmin_ID(malladmin);
		malladmin.setShopowner(shopowner1);

		ShopOwner shopOwner2 = new ShopOwner();
//		shopOwner2.setId(707);
		shopOwner2.setName("Aakash");
		shopOwner2.setAddress("Maharashtra");
		shopOwner2.setDob(LocalDate.of(1996, 4, 10));
		shopOwner2.setMalladmin_ID(malladmin);
		malladmin.setShopowner(shopOwner2);
		a_service.approveNewShop(shop2);
		a_service.approveNewShop(shop1);

		// Creating Users
		User user1 = new User();
		// user1.setId(459);
		user1.setName("Murli");
		user1.setType("ShopOwner");
		user1.setPassword("Ojha800");
		shopowner1.setUser_ID(user1);
		u_service.addUser(user1);

		User user2 = new User();
		// user2.setId(484);
		user2.setName("Mohan");
		user2.setType("Admin");
		user2.setPassword("acxxhs");
		malladmin.setUser(user2);
		u_service.addUser(user2);

		System.out.println("succesfull");
	}
}
