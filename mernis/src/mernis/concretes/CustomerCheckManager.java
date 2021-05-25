package mernis.concretes;

import mernis.abstracts.CustomerCheckService;
import mernis.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

	

}
