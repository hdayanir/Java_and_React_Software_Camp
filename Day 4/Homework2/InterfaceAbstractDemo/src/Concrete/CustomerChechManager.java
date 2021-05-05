package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerChechManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
		
		
	}

	

}
