// github.com/hdayanir

package day4_Homework1_interfaces;
//public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal ,IRepository{
// bu tanimlama sekli ise extends ve implement i ayni anda kullanmaya ait ornek bir yapi

public class MySqlCustomerDal implements ICustomerDal ,IRepository{
	//Classlar birden fazla inteface ' leri implement edebilir. Fakat 1 tane class ' i extends edebilir.
 	@Override
	public void Add() {
		System.out.println("My Sql eklendi");
		
	}

}
