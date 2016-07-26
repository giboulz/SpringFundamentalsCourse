package com.gbz.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.gbz.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	
	@Value("${someProperty}")
	private String someValue; 
	
	/* (non-Javadoc)
	 * @see com.gbz.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<Customer>(); 
		
		Customer c = new Customer(); 
		c.setFirstName("Jean "+someValue);
		c.setLastName("albert");
		
		customers.add(c); 
		
		return customers; 
	}
}
