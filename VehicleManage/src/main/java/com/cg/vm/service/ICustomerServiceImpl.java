package com.cg.vm.service;

import java.util.List;

import com.cg.vm.bean.Customer;
import com.cg.vm.dao.ICustomerRepository;
import com.cg.vm.dao.ICustomerRepositoryImpl;


public class ICustomerServiceImpl implements ICustomerService{
	private ICustomerRepository iCustomerRepository;
	public ICustomerServiceImpl() {
		iCustomerRepository =  new ICustomerRepositoryImpl();
	}
	

	@Override
	public Customer addCustomer(Customer customer) {
		return iCustomerRepository.addCustomer(customer);
	}

	@Override
	public Customer removeCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer viewCustomer(Customer c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	//public List<Customer> viewAllCustomer(String vtype) {
		// TODO Auto-generated method stub
		//return null;
	//}
	@Override
	public List<Customer> viewAllCustomer() {
		// TODO Auto-generated method stub
		ICustomerRepository iCustomerRepository= new ICustomerRepositoryImpl();
		return  iCustomerRepository.viewAllCustomer();
	}

	@Override
	public List<Customer> viewAllCustomersByLocation(String location) {
		// TODO Auto-generated method stub
		return null;
	}

}
