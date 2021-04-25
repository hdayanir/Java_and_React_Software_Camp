// github.com/hdayanir

package deneme;

public class ornek {

	public static void main(String[] args) {
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
			System.out.println(aranacakSayi+" : Sayi mevcuttur.");
		}
		else {
			System.out.println(aranacakSayi+" : Sayi mevcut degildir.");
		}

	}

}

