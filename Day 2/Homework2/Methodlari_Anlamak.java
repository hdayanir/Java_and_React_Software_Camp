// github.com/hdayanir

package methods;

public class Main {
	public static void main(String[] args) {
		System.out.println("--------- Java Dersi 24 - Methodlari Anlamak ------------");

		sayiBulmaca();
	}
	
	public static void sayiBulmaca() {
		int[] sayilarAranan = new int[] {1,2,5,7,9,0};
		int aranacakSayi= 5;
		boolean varMi = false;
		for (int sayiAranan: sayilarAranan) {
			if(sayiAranan==aranacakSayi) {
				varMi=true;
				break;
			}
		}
		if(varMi) {
			mesajVer(aranacakSayi+" : Sayi mevcuttur.");
		}
		else {
			mesajVer(aranacakSayi+" : Sayi mevcut degildir.");
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	} 
}