package mernis.concretes;

import mernis.abstracts.BaseCustomerManager;
import mernis.abstracts.CustomerCheckService;
import mernis.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			System.out.println("Not vailed person");
		}
	}
	
	
}
