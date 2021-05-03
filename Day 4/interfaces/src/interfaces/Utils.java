// github.com/hdayanir

package interfaces;

public class Utils {
	public static void runLoggers(Logger[] loggers ,String message) {
		// static ekleyerek diger sayfalarda runLogger'i cagirirken new'leme ihtiyaci ortadan kalkiyor.
		// not : ust classda yani ana classda static eklenmez alt classlarda eklenebilir.
		
		for(Logger logger : loggers) {
			logger.log(message);
			
		}
		
	}
}
