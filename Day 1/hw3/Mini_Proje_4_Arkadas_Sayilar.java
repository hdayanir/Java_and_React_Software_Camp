package deneme;

public class ornek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
