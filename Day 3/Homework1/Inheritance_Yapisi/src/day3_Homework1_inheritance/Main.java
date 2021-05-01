// github.com/hdayanir

package day3_Homework1_inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		//customerManager.Add(""); 			// miras aldigi PersonManager Classs'indan List ve Add 
											// komutlarini çagirabiliyoruz
		//employeeManager.BestEmployee("");	// miras aldigi Personmanager Classs'indan BestEmployee ,  List 
											// ve Add komutlarini çagirabiliyoruz
	}
}