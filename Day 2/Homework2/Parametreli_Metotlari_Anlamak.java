// github.com/hdayanir

package methods2;

public class Main {

	public static void main(String[] args) {
		System.out.println("--------- Java Dersi 25 - Parametreli Methodlari Anlamak ------------");
		String mesaj ="Bugün hava çok güzel";
		String yeniMesaj = mesaj.substring(0,2);
		yeniMesaj =sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5,7);
		System.out.println(sayi);
	}
	
	public static void ekle() {
		System.out.println("Eklendi.");
	}
	
	public static void sil() {
		System.out.println("Silindi.");		
	}

	public static void guncelle() {	
		System.out.println("Guncellendi.");
	}
	
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
}