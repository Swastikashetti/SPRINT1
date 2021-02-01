package com.cg.vm.util;

import org.hibernate.usertype.UserCollectionType;

import com.cg.vm.bean.Customer;
import com.cg.vm.bean.User;
import com.cg.vm.dao.ICustomerRepositoryImpl;
import com.cg.vm.service.ICustomerService;
import com.cg.vm.service.ICustomerServiceImpl;
import com.cg.vm.service.IUserService;
import com.cg.vm.service.IUserServiceImpl;

/**
 * This Does the Customer Registration i.e Adds New Customer to the DB!
 *
 */
public class CustomerRegistrationMenu extends VMSMainMenu{

	public void customerregisterstart() {
		Customer customer = new Customer();

		System.out.println("--------Customer Registration-----------");
		
		System.out.println("Enter Your First Name");
		customer.setFirstName(scanner.next());
		
		System.out.println("Enter Your Last Name");
		customer.setLastName(scanner.next());
		
		System.out.println("Enter Your Contact Number");
		customer.setMobileNumber(scanner.next());
		
		System.out.println("Enter Your Email ID");
		customer.setEmailId(scanner.next());
		
		System.out.println("Enter Your Address");
		customer.setAddress(scanner.next());
		
		System.out.println("Please Enter UserId PassWord To Login From Next Time");
		System.out.println("Enter your User Id");
		customer.setUserId(scanner.next());
		
		System.out.println("Enter your Password");
		customer.setPassword(scanner.next());
		
		customer.setRole("Customer");
		System.out.println("Registering Your Details. Please Wait!");
		ICustomerService registerCustomer = new ICustomerServiceImpl();
		Customer registerdCustomer = registerCustomer.addCustomer(customer);
        registerCustomer.addCustomer(registerdCustomer);
		System.out.println(" Hello "+registerdCustomer.getFirstName()+" Your Registration Completed Successfully");
		System.out.println(registerdCustomer);
	
	}

}
