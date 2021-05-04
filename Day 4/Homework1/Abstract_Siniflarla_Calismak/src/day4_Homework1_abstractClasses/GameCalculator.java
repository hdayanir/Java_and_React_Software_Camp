// github.com/hdayanir

package day4_Homework1_abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla() ;//GameCalculator' u kim kullaniyorsa hesaplayý içermek zorunda
			//Fakat hesaplayi override etmek zorunda yani kendi hesaplasini yazmak zorunda
	
	public final void gameOver() {  //GameCalculator' u kim kullaniyorsa bu fonksiyonu kullanmak zorunda
		System.out.println("Oyun bitti.");
		
	}
}
