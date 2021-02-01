package com.cg.vm.service;

import java.util.List;

import com.cg.vm.bean.Customer;

public interface ICustomerService {

	public Customer addCustomer(Customer customer);
	public Customer removeCustomer(Customer customer);
	public Customer viewCustomer(Customer c);
	public Customer updateCustomer(Customer c);
	//public List<Customer> viewAllCustomer(String vtype);
	public List<Customer> viewAllCustomer();
	public List<Customer> viewAllCustomersByLocation(String location);
	
}
