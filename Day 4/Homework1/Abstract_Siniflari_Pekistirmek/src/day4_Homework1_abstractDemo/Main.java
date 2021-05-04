// github.com/hdayanir

package day4_Homework1_abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager= new OracleDatabaseManager();
		customerManager.getCustomers();

		customerManager.databaseManager= new SqlServerDatabaseManager();
		customerManager.getCustomers();
		
		customerManager.databaseManager= new MySqlDatabaseManager();
		customerManager.getCustomers();

	}

}
