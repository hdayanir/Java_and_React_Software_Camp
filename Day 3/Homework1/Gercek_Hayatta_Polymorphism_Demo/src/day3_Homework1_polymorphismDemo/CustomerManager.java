// github.com/hdayanir

package day3_Homework1_polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger= logger;
	}
	public void add() {
	System.out.println("Musteri Eklendi");
	this.logger.log("Log mesajý ");	
	}
}
