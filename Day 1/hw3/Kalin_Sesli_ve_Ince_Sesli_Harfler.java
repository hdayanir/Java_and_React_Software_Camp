// github.com/hdayanir

package deneme;

public class ornek {

	public static void main(String[] args) {
		char harf='A';
		switch(harf){
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(harf + " : Kalın sesli harftir.");
				break;
			default:
				System.out.println(harf + " : İnce sesli harftir.");
		}

	}

}
