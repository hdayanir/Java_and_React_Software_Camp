// github.com/hdayanir

package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

// Bu class JLogger ' daki JLoggerManager class' ini kendi projemize eklememiz 
// icin olusturdugumuz adaptasyon sýnýfýdýr.

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		JLoggerManager manager= new JLoggerManager();
		manager.log(message);
	}
	

}
