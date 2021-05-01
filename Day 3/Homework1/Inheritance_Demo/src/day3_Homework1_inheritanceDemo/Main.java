// github.com/hdayanir

package day3_Homework1_inheritanceDemo;
//kredi hesaplama modülü
public class Main {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManaer = new OgretmenKrediManager();
		ogretmenKrediManaer.Hesapla();
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
