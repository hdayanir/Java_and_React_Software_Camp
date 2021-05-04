// github.com/hdayanir

package day4_Homework1_interfaces;

public class Main {

	public static void main(String[] args) {
		//interface kullanmamizdaki asil amac referans tutmaktir.
		ICustomerDal customerDal = new OracleCustomerDal();//ornegin burada OracleCustomerDal' in referansini turmustur.
		customerDal.Add();
		
		customerDal = new MySqlCustomerDal();//ornegin burada MySqlCustomerDal' in referansini turmustur.
		customerDal.Add();

	}

}
