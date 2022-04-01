package com.tns.cg.smms.client;

import com.tns.cg.smms.entity.Customer;
import com.tns.cg.smms.entity.Employee;
import com.tns.cg.smms.entity.Mall;
import com.tns.cg.smms.entity.MallAdmin;
import com.tns.cg.smms.entity.OrderDetails;
import com.tns.cg.smms.entity.Shop;
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

public class SMMS_delete {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Invoking Admin service
		IAdminService a_service = new IAdminServiceImpl();

		// Invoking Customer Service
		ICustomerService c_service = new ICustomerServiceImpl();

		// Invoking Employee Service
		IEmployeeService e_service = new IEmployeeServiceImpl();

		// Invoking Order service
		IOrderService o_service = new IOrderServiceImpl();

		// Invoking Shop Service
		IShopService s_service = new IShopServiceImpl();

		// Invoking User service
		IUserService u_service = new IUserServiceImpl();

		// Step 2. Implementation

		// Deleting Customer details from Database
		Customer customer = new Customer();
		customer = c_service.searchCustomer(1);
		c_service.deleteCustomer(1);

		// Deleting Employee Details from Database
		Employee employee = new Employee();
		employee = e_service.searchEmployee(2);
		e_service.deleteEmployee(2);

		// Deleting Mall from Database
		Mall mall = new Mall();

		// Deleting Mall Admin Details
		MallAdmin malladmin = new MallAdmin();

		// Deleting order
		OrderDetails orderdetails = new OrderDetails();
		orderdetails = o_service.searchOrder(9);
		c_service.deleteOrder(9);

		// Deleting Shop Details
		Shop shop = new Shop();
		shop = s_service.searchShopById(10);
		s_service.deleteShop(10);

	}
}
