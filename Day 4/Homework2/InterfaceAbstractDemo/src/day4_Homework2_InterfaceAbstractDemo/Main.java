package day4_Homework2_InterfaceAbstractDemo;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter() );
		customerManager.save(new Customer(1, "HÜSEYÝN", "DAYANIR", "1996", "35515899184"));
		/*customerManager.save(new Customer(2, "Muhammed", "Bilgin", "1995 -  9 - 2", "22222222222"));
		Customer customer = new Customer();
		customer.setId(3);
		customer.setFirstName("Emre");
		customer.setLastName("Goc");
		customer.setNationalyid("33333333333");
		customer.setDateOfBirth("1994 - 9 - 2");
		customerManager.save(customer);
		*/
	}
}
