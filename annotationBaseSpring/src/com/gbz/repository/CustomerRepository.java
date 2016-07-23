package com.gbz.repository;

import java.util.List;

import com.gbz.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}