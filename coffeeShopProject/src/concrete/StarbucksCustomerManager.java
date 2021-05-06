 package concrete;

import abstracts.BaseCustomerManager;
import entities.Customer;
import interfaces.CustomerCheckService;



public class StarbucksCustomerManager extends BaseCustomerManager  {
	
	public CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		
		else {
			System.out.println("Not a valid person!");
		}
	}
	
	
	
	
	

	
}
