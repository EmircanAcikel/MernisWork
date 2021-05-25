package mernis.concretes;

import mernis.abstracts.BaseCustomerManager;
import mernis.entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	@Override
	public void Save(Customer customer) {
		System.out.println("Veritababnına kaydedildi : " + customer.getFirstName());
	}
	

}
