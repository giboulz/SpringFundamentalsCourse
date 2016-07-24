package com.gbz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gbz.model.Customer;
import com.gbz.repository.CustomerRepository;
import com.gbz.repository.HibernateCustomerRepositoryImpl;

@Service("customerService")
public class CustomersServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo ;  
	
	public List<Customer> findAll(){
		return customerRepo.findAll(); 
	}
	
}
