package mernis.concretes;

import mernis.abstracts.BaseCustomerManager;
import mernis.entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	@Override
	public void Save(Customer customer) {
		System.out.println("Veritababn�na kaydedildi : " + customer.getFirstName());
	}
	

}
