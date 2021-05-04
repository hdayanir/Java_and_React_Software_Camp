// github.com/hdayanir

package day4_Homework1_interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
		
		customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
		
		customerManager = new CustomerManager(new SqlServerCustomerDal());
		customerManager.add();
	}

}
