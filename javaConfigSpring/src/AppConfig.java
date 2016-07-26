import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.gbz.repository.CustomerRepository;
import com.gbz.repository.HibernateCustomerRepositoryImpl;
import com.gbz.service.CustomerService;
import com.gbz.service.CustomersServiceImpl;

@Configuration
@ComponentScan({"com.gbz"})
public class AppConfig {

	@Bean(name="customerService")
	public CustomerService getCustomerService(){
		//injectino par setter
		//CustomersServiceImpl customerService = new CustomersServiceImpl(); 
		//customerService.setCustomerRepo(getCustomerRepository());
		
		//injection par contrstructeur
		//CustomersServiceImpl customerService = new CustomersServiceImpl(getCustomerRepository());
		
		//autowired
		CustomersServiceImpl customerService = new CustomersServiceImpl();
		
		return customerService; 
		
	}
	
	@Bean(name= "customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new HibernateCustomerRepositoryImpl(); 
	}
}
