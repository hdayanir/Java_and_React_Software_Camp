// github.com/hdayanir

package day4_Homework1_interfaces;

public class CustomerManager {
	private ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal) {//CustomerManager ' in Cunstructor'inda bir tane ICustomerDal istiyorum.
		this.customerDal= customerDal;
	}
	
	public void add() {
		//Dal' in icerisinde zaten add() kodu vardi. biz burda neden tekrar add() komutu yazdik.
		//Burada is kodlari yazilir. musterinin adi , veriler dogru mu gibi veriler burada yazilir.
		customerDal.Add();
	}
}
