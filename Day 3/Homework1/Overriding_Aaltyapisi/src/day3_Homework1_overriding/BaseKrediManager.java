// github.com/hdayanir

package day3_Homework1_overriding;

public class BaseKrediManager {
	public double hesapla (double tutar) {
	// public final double hesapla (double tutar) {	
		//  bu operasyon herkes i�in ayn�d�r ve bunun  asla 
		//  override edilmesini (ezilmesini) istemiyorsak  
		//  bunu 'final' anahtar kelimesiyle ger�ceklestiriyoruz.
		
		return tutar * 1.18;
	}
}
//Overridable