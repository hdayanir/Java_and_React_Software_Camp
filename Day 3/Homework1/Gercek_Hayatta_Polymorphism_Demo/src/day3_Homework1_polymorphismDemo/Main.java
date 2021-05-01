// github.com/hdayanir

package day3_Homework1_polymorphismDemo;

import java.util.logging.Logger;

//Loglama
public class Main {

	public static void main(String[] args) {
		EmailLogger emailLogger = new EmailLogger();
		emailLogger.log("Log mesaji");
		DatabaseLogger databeseLogger = new DatabaseLogger();
		databeseLogger.log("Log mesaj");
		FileLogger fileLogger= new FileLogger();
		fileLogger.log("mesaj");
		
		System.out.println("-------------");
		
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
												// yeni logger eklemek bu sistemde cok kolay ve bsit ve buna 
												// polymorphism denir.
		for(BaseLogger baseLogger:loggers){
			baseLogger.log("Log mesaji1");
		}
		
		System.out.println("-------------");

		CustomerManager customerManager= new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
		customerManager= new CustomerManager(new FileLogger());
		customerManager.add();
		
	}
}
