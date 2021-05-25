package mernis.abstracts;

import mernis.entities.Customer;

public interface CustomerCheckService {

	public boolean checkIfRealPerson(Customer customer);
}
