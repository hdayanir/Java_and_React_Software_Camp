// github.com/hdayanir


package hw1;

public class Main {

	public static void main(String[] args) {
		System.out.println("--------- Java Dersi 5 - Hello World ------------");
		
		System.out.println("Merhaba Java");
		System.out.println("Merhaba Java 2");


		System.out.println("--------- Java Dersi 6 - Degiskenler ------------");	
		
		int sayi =10;
		String mesaj = "Ogrenci sayisi : ";
		System.out.println ("Ogrenci sayisi : 10");
		System.out.println("Ogrenci sayisi : "  + sayi);
		System.out.println(mesaj + sayi);


		System.out.println("--------- Java Dersi 7 - Temel veri tipleri ------------");
		
		int sayi1=12;
		sayi1=1300000;
		byte sayi2=12;	 	    //byte : -128 ile 127 aras� deger alir 
		sayi2=127; 
		double sayi3= 12.5; 	//double : ondal�kl� sayi alir
		char karakter ='a'; 	//char : tek karakter deste�ine sahiptir.
		boolean dogruMu = true; //boolean: do�ru yada yanl�� �eklinde de�er al�r.


		System.out.println("--------- Java Dersi 8 - if bloklari ------------");
		
		int sayi4= 20;
		if(sayi<20) {
			System.out.println("Sayi 20'den k���kt�r");
		}
		else if(sayi==20){
			System.out.println("Sayi 20' ye esittir.");
		}
		else {
			System.out.println("Say� 20'den b�y�kt�r");
		}


		System.out.println("--------- Java Dersi 9 - raCap Demo 1 ------------");
		
		int sayi5=20;
		int sayi6=25;
		int sayi7=2;
		int enBuyuk=sayi5;
		if(enBuyuk<sayi6) {
			enBuyuk=sayi6;
		}
		if(enBuyuk<sayi7) {
			enBuyuk=sayi7;
		}		System.out.println("En b�y�k sayi :" + enBuyuk);

		// github.com/hdayanir

		System.out.println("--------- Java Dersi 10 - Switch Bloklari ------------");
		
		char grade ='A';
		switch(grade){
			case 'A':
				System.out.println("M�kemmel : Ge�tiniz");
			break;
			case 'B':
				System.out.println("�ok g�zel : Ge�tiniz");
			break;
			case 'C':
				System.out.println("Iyi : Ge�tiniz");
			break;
			case 'D':
				System.out.println("Fena degil : Ge�tiniz");
			break;
			case 'F':
				System.out.println("Malesef kaldiniz");
			break;
			default:
				System.out.println("Ge�ersiz harf girdiniz");
		}		
		
		
		System.out.println("--------- Java Dersi 11 - For D�ng�s� ------------");

		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For d�ng�s� bitti");
		
		for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For d�ng�s� bitti");

		
		System.out.println("--------- Java Dersi 12 - While D�ng�s� ------------");
		
		int i=1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While d�ng�s� bitti");
		i=1;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While d�ng�s� bitti");

		
		System.out.println("--------- Java Dersi 13 - Do While D�ng�s� ------------");
		
		int j=1;
		do {
			System.out.println(j);
			j++;
		}
		while(j<10) ;
		System.out.println("do While d�ng�s� bitti");
		j=1;
		do {
			System.out.println(j);
			j+=2;
		}
		while(j<10) ;		
		System.out.println("do While d�ng�s� bitti");

		
		System.out.println("--------- Java Dersi 14 - Diziler ------------");
				
		System.out.println("Dizi olmadan yazdirma");
		String ogrenci1="Engin";
		String ogrenci2="Derin";
		String ogrenci3="Salih";
		String ogrenci4="Ahmet";
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		System.out.println("Dizi tanimlayarak yazdirma");
		String[] ogrenciler= new String [4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Ahmet";
		
		for (int l = 0; l < ogrenciler.length; l++) {
			System.out.println(ogrenciler[l]);
		}
		System.out.println("Dizi tanimlayarak yazdirma");
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		// github.com/hdayanir

		System.out.println("--------- Java Dersi 15 - raCap Demo 2 ------------");
		
		double[] myList = {1.2,1.3,4.3,5.6};
		double toplam=0;
		double max=myList[0];
		for(double number : myList) {
			if(max<number) {
				max=number;
			}
			toplam = toplam+number;
			System.out.println(number);
		}
		System.out.println("Toplam : "+ toplam);
		System.out.println("En b�y�k sayi : "+ max);
		

		System.out.println("--------- Java Dersi 16 - �ok boyutlu Diziler ------------");
		
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "Istanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbak�r";
		sehirler[2][1] = "Sanliurfa";
		sehirler[2][2] = "Gaziantep";
		for (int m = 0; m <= 2 ;m++) {
			System.out.println("--------");
			for (int n = 0; n <=2; n++) {
				System.out.println(sehirler[m][n]);
			}
		}


		System.out.println("--------- Java Dersi 17 - Striglerle calismak ------------");
		
		String mesaj1  ="Bug�n hava �ok g�zel.";
		System.out.println(mesaj1);
		System.out.println("Eleman sayisi  : " + mesaj1);
		System.out.println("5. eleman : " + mesaj1.charAt(4));
		System.out.println(mesaj1.concat("Yasasin"));
		System.out.println(mesaj1.startsWith("B"));
		System.out.println(mesaj1.endsWith("."));
		char[] karakterler1= new char[5];
		mesaj1.getChars(0 ,5 , karakterler1,0);//belirli karakterleri al�r ve bir yere atar
		System.out.println(karakterler1);
		System.out.println(mesaj1.indexOf("av"));
		System.out.println(mesaj1.lastIndexOf('a'));


		System.out.println("--------- Java Dersi 18 - Mini Proje 1 ------------");
		
		System.out.println(mesaj1.replace(' ', '-'));
		System.out.println(mesaj1.substring(2));
		System.out.println(mesaj1.substring(2,4));
		for (String kelime: mesaj1.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj1.toLowerCase());
		System.out.println(mesaj1.toUpperCase());
		System.out.println(mesaj1.trim());


		System.out.println("--------- Java Dersi 19 - Mini Proje 2 - Sayi asal Mi ------------");
		
		int numara= 25;
		int kalan = numara % 2;
		System.out.println("Kalan : " + kalan);
		boolean isPrime = true;
		if(numara ==1) {
			System.out.println(numara + ": Bu say� asal degildir");
		}
		if (numara<1) {
			System.out.println(numara + ": Ge�ersiz sayi");
			return;
		}
			
		for (int a = 2; a < numara; a++) {
			if (numara %a==0) {
				isPrime=false;
				}
		}
		if (isPrime== true) {
			System.out.println(numara + ": Bu sayi asaldir");
		}
		else {
			System.out.println(numara + ": Bu sayi asal degildir");
		}


		System.out.println("--------- Java Dersi 20 - Kalin Sesli ve Ince Sesli Harfler ------------");
		
		char harf='A';
		switch(harf){
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(harf + " : Kalin sesli harftir.");
				break;
			default:
				System.out.println(harf + " : Ince sesli harftir.");
		}

		
		System.out.println("--------- Java Dersi 21 - Mini Proje 3 - M�kemmel Sayi ------------");
		
		//M�kemmel say�, say�lar teorisinde, kendisi hari� pozitif tam b�lenlerinin toplam� kendisine e�it olan say�.
		
		int numara1 =5;
		int total = 0;
		for (int b = 1; b < numara1; b++) {
			if (numara1 % b == 0) {
				total=total +b;
			}
		}
		if (total==numara1) {
			System.out.println(numara1 + " : M�kemmel sayidir.");
		}
		else {
			System.out.println(numara1 + " : M�kemmel sayi degildir.");
		}

		
		System.out.println("--------- Java Dersi 22 - Mini Proje 4 - Arkadas Sayilar ------------");
		//�ki say� birbirinin kendisi hari� b�lenleri toplam�na e�itse bu say�lara arkada� say�lar denir. 
		//�rnek: 220 ve 284 220: 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284 284: 1 + 2 + 4 + 71 + 142 = 220
		
		int arkadas1=220;
		int arkadas2=284;
		int toplamarkadas1=0;
		int toplamarkadas2=0;
		for (int c = 1; c < arkadas1; c++) {
			if (arkadas1%c==0) {
				toplamarkadas1=toplamarkadas1+c;				
			}
		}
		for (int c = 1; c < arkadas2; c++) {
			if (arkadas2%c==0) {
				toplamarkadas2=toplamarkadas2+c;				
			}
		}
		if (arkadas1==toplamarkadas1 && arkadas2==toplamarkadas2) {
			System.out.println(arkadas1+ " , " +arkadas2+ " : Bu iki sayi bir arkadastir");		
		}
		else {
			System.out.println(arkadas1+ " , " +arkadas2+ " : Bu iki sayi bir arkadas degildir");		
		}

		
		System.out.println("--------- Java Dersi 23 - Mini Proje 5 - Sayi Bulma ------------");
		
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
