package mernis.abstracts;

import mernis.entities.Customer;

public class BaseCustomerManager implements CustomerService{

	@Override
	public void Save(Customer customer) {
		System.out.println("Veritababnýna kaydedildi : " + customer.getFirstName());
		
	}

}
