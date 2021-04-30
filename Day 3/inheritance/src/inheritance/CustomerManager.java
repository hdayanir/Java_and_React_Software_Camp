// github.com/hdayanir

package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.id+"kaydedildi");	
	}
	
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {//customers'daki herbir customer icin add ' i calistir
			add(customer);
		}
		
	}
}
