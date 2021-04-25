// github.com/hdayanir

package deneme;

public class ornek {

	public static void main(String[] args) {
		char grade ='A';
		switch(grade){
			case 'A':
				System.out.println("Mükemmel : Geçtiniz");
			break;
			case 'B':
				System.out.println("Çok güzel : Geçtiniz");
			break;
			case 'C':
				System.out.println("İyi : Geçtiniz");
			break;
			case 'D':
				System.out.println("Fena değik : Geçtiniz");
			break;
			case 'F':
				System.out.println("Malesef kaldınız");
			break;
			default:
				System.out.println("Geçersiz harf girdiniz");
		}		

	}

}
