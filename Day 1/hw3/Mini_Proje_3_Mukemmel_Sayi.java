// github.com/hdayanir

package deneme;

public class ornek {

	public static void main(String[] args) {
		//Mükemmel sayı, sayılar teorisinde, kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayı.
		
				int numara1 =5;
				int total = 0;
				for (int b = 1; b < numara1; b++) {
					if (numara1 % b == 0) {
						total=total +b;
					}
				}
				if (total==numara1) {
					System.out.println(numara1 + " : Mükemmel sayidir.");
				}
				else {
					System.out.println(numara1 + " : Mükemmel sayi değildir.");
				}


	}

}
