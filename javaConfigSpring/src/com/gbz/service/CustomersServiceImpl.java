package com.gbz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gbz.model.Customer;
import com.gbz.repository.CustomerRepository;
import com.gbz.repository.HibernateCustomerRepositoryImpl;

public class CustomersServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepo;

	public void setCustomerRepo(CustomerRepository customerRepo) {
		this.customerRepo = customerRepo;
	}

	public CustomersServiceImpl() {

	}

	public CustomersServiceImpl(CustomerRepository customerRepository) {
		this.customerRepo = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepo.findAll();
	}

}
