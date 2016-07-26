import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gbz.service.CustomerService;
import com.gbz.service.CustomersServiceImpl;

public class Application {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class); 
	
		
		CustomerService customerService = appContext.getBean("customerService", CustomerService.class); 
		System.out.println(((customerService.findAll()).get(0)).getFirstName());
	}

}
