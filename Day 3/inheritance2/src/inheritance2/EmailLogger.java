// github.com/hdayanir

package inheritance2;

public class EmailLogger extends Logger {
	
	//Override : loggerdaki kodu ezip buraya kendi� �zel olarak kod yazmka icin kullanildi.
	public void log() {
		System.out.println("Email yollandi");
	}
}
