import com.gbz.service.CustomerService;
import com.gbz.service.CustomersServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService customerService = new CustomersServiceImpl();
		System.out.println(((customerService.findAll()).get(0)).getFirstName());
	}

}
