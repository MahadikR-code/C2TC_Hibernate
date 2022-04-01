package com.tns.cg.smms.client;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.cg.smms.entity.Customer;
import com.tns.cg.smms.entity.Employee;
import com.tns.cg.smms.entity.Item;
import com.tns.cg.smms.entity.Mall;
import com.tns.cg.smms.entity.MallAdmin;
import com.tns.cg.smms.entity.OrderDetails;
import com.tns.cg.smms.entity.Shop;
import com.tns.cg.smms.entity.ShopOwner;
import com.tns.cg.smms.entity.User;

public class MappTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		// Creating Shops
		Shop shop1 = new Shop();
		shop1.setShopName("Books");
		shop1.setShopCategory("abc");
		shop1.setShopStatus("Open");
		shop1.setLeaseStatus(null);
		entitymanager.persist(shop1);

		Shop shop2 = new Shop();
		shop2.setShopName("Snacks");
		shop2.setShopCategory("abc");
		shop2.setShopStatus("Close");
		shop2.setLeaseStatus(null);
		entitymanager.persist(shop2);

		// Creating customers
		Customer customer1 = new Customer();
		customer1.setName("Raj");
		customer1.setPhone("112233445566");
		customer1.setEmail("abc@gmail.com");
		shop1.setCustomers("customer1");
		entitymanager.persist(customer1);

		Customer customer2 = new Customer();
		customer1.setName("Puja");
		customer1.setPhone("123456789");
		customer1.setEmail("xyz@gmail.com");
		shop2.setCustomers("customer2");
		entitymanager.persist(customer2);

		// Creating Employees
		Employee employee1 = new Employee();
		employee1.setName("Ashish");
		employee1.setAddress("Mumbai");
		employee1.setDob(LocalDate.of(1998, 10, 7));
		employee1.setDesignation("Employee");
		employee1.setSalary(10000);
		employee1.setShop(shop1);
		entitymanager.persist(employee1);

		Employee employee2 = new Employee();
		employee2.setName("dipa");
		employee2.setAddress("Pune");
		employee2.setDob(LocalDate.of(1996, 7, 11));
		employee2.setDesignation("Employee");
		employee2.setSalary(10000);
		employee2.setShop(shop2);
		entitymanager.persist(employee2);

		// Creating Items
		Item item1 = new Item();
		item1.setItemName("Pizza");
		item1.setPrice(100);
		item1.setCategory(" dsf");
		item1.setExpiry(LocalDate.of(2024, 1, 10));
		item1.setManufacturingDate(LocalDate.of(2022, 10, 10));
		item1.setShopID(shop2);
		entitymanager.persist(item1);

		Item item2 = new Item();
		item2.setItemName("abcd");
		item2.setPrice(1000);
		item2.setCategory("Comic Book");
		item2.setExpiry(null);
		item2.setManufacturingDate(null);
		item2.setShopID(shop1);
		entitymanager.persist(item2);

		// Creating Mall
		Mall mall = new Mall();
		mall.setCategories("cf");
		mall.setLocation("Mumabi");
		mall.setMallName("CTC");
		entitymanager.persist(mall);

		// Creating MallAdmin
		MallAdmin malladmin = new MallAdmin();
		malladmin.setMall(mall);
		malladmin.setName("Ratnakar");
		malladmin.setPassword("acxxhs");
		malladmin.setPhone("154678913");
		mall.setMallAdmin(malladmin);
		entitymanager.persist(malladmin);

		// Creating oders
		OrderDetails order1 = new OrderDetails();
		order1.setCustomer_id(customer1);
		order1.setDateOfPurchase(LocalDate.of(2022, 10, 3));
		order1.setPaymentMode("Cash");
		order1.setTotal(100);
		entitymanager.persist(order1);

		OrderDetails order2 = new OrderDetails();
		order2.setCustomer_id(customer2);
		order2.setDateOfPurchase(LocalDate.of(2021, 10, 10));
		order2.setPaymentMode("Card");
		order2.setTotal(5);
		entitymanager.persist(order2);

		// Creating Shop Owners
		ShopOwner shopowner1 = new ShopOwner();
		shopowner1.setName("Rohit");
		shopowner1.setAddress("Maharashtra");
		shopowner1.setDob(LocalDate.of(1098, 10, 8));
		shopowner1.setMalladmin_ID(malladmin);
		malladmin.setShopowner(shopowner1);
		entitymanager.persist(shopowner1);

		ShopOwner shopOwner2 = new ShopOwner();
		shopOwner2.setName("Aakash");
		shopOwner2.setAddress("Maharashtra");
		shopOwner2.setDob(LocalDate.of(1996, 4, 10));
		shopOwner2.setMalladmin_ID(malladmin);
		malladmin.setShopowner(shopOwner2);
		entitymanager.persist(shopOwner2);

		// Creating Users
		User user1 = new User();
		user1.setName("Murli");
		user1.setType("ShopOwner");
		user1.setPassword("Ojha800");
		shopowner1.setUser_ID(user1);
		entitymanager.persist(user1);

		User user2 = new User();
		user2.setName("Mohan");
		user2.setType("Admin");
		user2.setPassword("acxxhs");
		malladmin.setUser(user2);
		entitymanager.persist(user2);

		List<OrderDetails> obj = new ArrayList<OrderDetails>();
		obj.add(order2);
		obj.add(order1);
		customer1.setOrder_id(obj);
		customer2.setOrder_id(obj);

		List<Employee> emp = new ArrayList<Employee>();
		emp.add(employee1);
		emp.add(employee2);
		shop1.setShopEmployeeID(emp);
		shop2.setShopEmployeeID(emp);

//		// Update Operation
//		service.updateEmployee(employee2);
//		service.updateEmployee(employee1);
//		service.updateShop(shop2);
//		service.updateShop(shop1);
//
//		aService.updateUser(user2);
//		aService.updateUser(user1);
//
//		cService.updateCustomer(customer2);
//		cService.updateCustomer(customer1);
//
//		oService.updateOrder(order2);
//		oService.updateOrder(order1);
//
//		uService.updateUser(user2);
//		uService.updateUser(user1);
//
//		eService.updateEmployee(employee2);
//		eService.updateEmployee(employee1);
//
//		// Search Operation
//		service.searchShopById(10);
//		// System.out.println("Shop Found: " +);
//
//		cService.searchCustomer(0);
//		cService.searchItem(0);
//		cService.searchMall(0);
//
//		oService.searchOrder(0);
//
//		uService.searchUser(0);
//
//		eService.searchEmployee(0);
//
//		// Delete Operation
//		service.deleteShop(0);
//
//		cService.deleteCustomer(0);
//
//		eService.deleteEmployee(0);

		System.out.println("Operation Performed Successfully");
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();

	}

}
