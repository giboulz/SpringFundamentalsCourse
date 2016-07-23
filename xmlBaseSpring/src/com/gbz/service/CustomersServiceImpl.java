package com.gbz.service;

import java.util.List;

import com.gbz.model.Customer;
import com.gbz.repository.CustomerRepository;

public class CustomersServiceImpl implements CustomerService {

	private CustomerRepository customerRepo ; 
	

	public void setCustomerRepo(CustomerRepository customerRepo) {
		this.customerRepo = customerRepo;
	}

	public List<Customer> findAll(){
		return customerRepo.findAll(); 
	}
	/*
	public CustomersServiceImpl(){
		
	}*/
	/*
	public CustomersServiceImpl(CustomerRepository customerRepository){
		this.customerRepo = customerRepository; 
		
	}*/
	
}
