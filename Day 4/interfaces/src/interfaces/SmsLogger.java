// github.com/hdayanir

package interfaces;
//Logger 'i SmsLooger 'a uyarla
public class SmsLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Sms gonderildi : " + message);
		
	} 

}
