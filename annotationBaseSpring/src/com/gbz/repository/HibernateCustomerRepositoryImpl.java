package com.gbz.repository;

import java.util.ArrayList;
import java.util.List;

import com.gbz.model.*;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	
	/* (non-Javadoc)
	 * @see com.gbz.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<Customer>(); 
		
		Customer c = new Customer(); 
		c.setFirstName("Jean");
		c.setLastName("albert");
		
		customers.add(c); 
		
		return customers; 
	}
}
