package kodlamaio.northwind.core.utilities.results;
//islem sonucu basarili olan kisim (data ekleme islemi)
public class SuccessResult extends Result {
	
	public SuccessResult() {
		super(true);
	}
	
	public SuccessResult(String message) {
		super(true,message);
		
	}

}
