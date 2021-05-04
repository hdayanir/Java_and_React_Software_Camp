// github.com/hdayanir

package day4_Homework1_interfaces;

public class OracleCustomerDal implements ICustomerDal, IRepository{
	//Classlar birden fazla inteface ' leri implement edebilir. Fakat 1 tane class ' i extends edebilir.
	@Override
	public void Add() {
		System.out.println("Oracle eklendi.");
		
	}

}
