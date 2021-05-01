// github.com/hdayanir

package day3_Homework1_overriding;

public class OgrenciKrediManager  extends BaseKrediManager{
	//Overriding
	public double hesapla (double tutar) {
		return tutar * 1.10;
	}
}
