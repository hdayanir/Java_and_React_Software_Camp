// github.com/hdayanir

package day4_Homework1_abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
		kidsGameCalculator.hesapla();
		kidsGameCalculator.gameOver();
		ManGameCalculator manGameCalculator = new ManGameCalculator();
		manGameCalculator.hesapla();
		manGameCalculator.gameOver();
		System.out.println("-- farkli bir yazdirma turu asagida ---");
		GameCalculator gameCalculator = new WomanGameCalculator();
		gameCalculator.hesapla();
		gameCalculator.gameOver();
	}

}
