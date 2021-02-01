package com.cg.vm.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.cg.vm.bean.Customer;

public class ICustomerRepositoryImplTest {
	
private  ICustomerRepository iCustomerRepository;
 

    
    @Before
	public void setup() {
    	iCustomerRepository=new  ICustomerRepositoryImpl();
	}
	@Test
	public void test_addcustomer_Is_GivenEmpty_ShouldReturn_null() {
    	//This is null customer object
    	Customer customer=new Customer();
		Customer result= iCustomerRepository.addCustomer(customer);
		//assert.Equals(null,result);
		assertEquals(customer, result);
		
	}
	@Test
	public void test_addcustomer_Is_GivenCustomer_ShouldReturn_Customer() {
    	//This is object customer not empty
    	Customer customer=new Customer(" ", "Devireddy","789","ha@","podili");
		Customer result= iCustomerRepository.addCustomer(customer);
		//assert.Equals(null,result);
		assertEquals(customer, result);
		
	}
	

}
