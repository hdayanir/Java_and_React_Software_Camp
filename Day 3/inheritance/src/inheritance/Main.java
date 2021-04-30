// github.com/hdayanir

package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer huseyin = new IndividualCustomer();
		huseyin.id=1;
		CorporateCustomer kodlamaio=new CorporateCustomer();
		kodlamaio.id=2;
		
		CustomerManager customerManager =new CustomerManager();
		//customerManager.add(kodlamaio);
		//customerManager.add(huseyin);
		
		//coklu musteri icin
		Customer[] customers = {huseyin,kodlamaio};
		customerManager.addMultiple(customers);
		
	}

}
