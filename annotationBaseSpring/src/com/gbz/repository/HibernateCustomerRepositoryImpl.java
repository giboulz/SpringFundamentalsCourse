package com.gbz.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gbz.model.*;

@Repository("customerRepository")
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
