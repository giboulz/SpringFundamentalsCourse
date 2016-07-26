package com.gbz.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.gbz.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${someProperty}")
	private String someVariable;
	
	/* (non-Javadoc)
	 * @see com.gbz.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<Customer>(); 
		
		Customer c = new Customer(); 
		c.setFirstName("Jean "+someVariable);
		c.setLastName("albert");
		
		customers.add(c); 
		
		return customers; 
	}
}
