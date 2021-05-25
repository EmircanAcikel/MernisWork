package mernis.adapters;

import mernis.abstracts.CustomerCheckService;
import mernis.entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
