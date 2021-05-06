
import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;


public class Main {

	
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		customer.setId(1);
		customer.setFirstName("Name");
		customer.setLastName("asdfsdf");
		customer.setBirthYear(1880);
		customer.setNationalityId("00000000000");
		
		/*BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		
		baseCustomerManager.save(customer);*/
		
		BaseCustomerManager baseCustomerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		baseCustomerManager1.save(customer);
	 
		
		

	}

}
