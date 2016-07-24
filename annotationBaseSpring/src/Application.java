import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gbz.service.CustomerService;
import com.gbz.service.CustomersServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		CustomerService customerService  = appContext.getBean("customerService", CustomerService.class);
		System.out.println(((customerService.findAll()).get(0)).getFirstName());
	}

}
