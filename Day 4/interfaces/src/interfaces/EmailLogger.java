// github.com/hdayanir

package interfaces;

public class EmailLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("E-mail gonderildi : "+ message);
		
	}

}