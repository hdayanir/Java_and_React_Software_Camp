// github.com/hdayanir

package methods2;

public class Main {

	public static void main(String[] args) {
		System.out.println("--------- Java Dersi 26 - Veriable Arguments ile Calismak ------------");
		int sayi = topla(5,7);
		System.out.println(sayi);
		int toplam = topla2(2,3,4,5,6,10);
		System.out.println(toplam);
	}
		
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	public static int topla2(int... sayilar) {// int... : integer array göndermis gibi tanimliyor
		//istedigimiz miktarda sayiyi toplamak icin kullanilan fonksiyon.
		int toplam =0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
}
