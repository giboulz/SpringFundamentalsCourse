package com.gbz.service;

import java.util.List;

import com.gbz.model.Customer;
import com.gbz.repository.CustomerRepository;
import com.gbz.repository.HibernateCustomerRepositoryImpl;

public class CustomersServiceImpl implements CustomerService {

	private CustomerRepository customerRepo = new HibernateCustomerRepositoryImpl(); 
	
	public List<Customer> findAll(){
		return customerRepo.findAll(); 
	}
	
}
