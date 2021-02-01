package com.cg.vm.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;

import com.cg.vm.bean.Customer;
import com.cg.vm.util.DBUtil;

public class ICustomerRepositoryImpl implements ICustomerRepository{
	DBUtil dbUtil = new DBUtil();
	/**
	 * create dbutil class object and create a entity manager from createEntityManager Function
	 */
	EntityManager entityManager = dbUtil.createEntityManager();
	

	@Override
	public Customer addCustomer(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();		
		return customer;
		
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
		entityManager.getTransaction().begin();
		Query query =entityManager.createQuery("from Customer");
		@SuppressWarnings("unchecked")
		List<Customer> customers = query.getResultList();
		for (Customer cus : customers) {
			System.out.println("----------List of Customers----------------");
			System.out.println(cus.Print());
			System.out.println("--------------------------");	
		}
		
		entityManager.getTransaction().commit();
		dbUtil.closeResources();
		
		return customers;
		
		
	}


	@Override
	public List<Customer> viewAllCustomersByLocation(String location) {
		// TODO Auto-generated method stub
		return null;
	}

}
