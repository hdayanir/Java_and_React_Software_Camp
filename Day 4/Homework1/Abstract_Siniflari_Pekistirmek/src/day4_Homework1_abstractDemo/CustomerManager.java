// github.com/hdayanir

package day4_Homework1_abstractDemo;

public class CustomerManager {
	BaseDatabaseManager databaseManager;//Hangi sistem calisiyorsa yani oracle veya sql server arasindan 
						//onun getDatas ' sini verecek.
	public void getCustomers() {
		databaseManager.getData();
	}
}
