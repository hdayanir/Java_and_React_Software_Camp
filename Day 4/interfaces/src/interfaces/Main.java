// github.com/hdayanir

package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};
		CustomerManager customerManager= new CustomerManager(loggers);
			
		
		Customer huseyin = new Customer(1,"Huseyin","Dayanir");
		customerManager.add(huseyin);

	}

}
