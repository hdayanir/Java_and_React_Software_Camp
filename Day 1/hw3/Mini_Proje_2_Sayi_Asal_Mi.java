// github.com/hdayanir

package deneme;

public class ornek {

	public static void main(String[] args) {
		int numara= 17;
		boolean isPrime = true;
		if(numara ==1) {
			System.out.println(numara + ": Bu sayı asal degildir");
		}
		if (numara<1) {
			System.out.println(numara + ": Gecersiz sayi");
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

	}

}
