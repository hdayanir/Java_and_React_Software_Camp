package kodlamaio.northwind.core.utilities.results;

//islem sonucu basarili olan kisim (data ekleme islemi)
public class ErrorResult extends Result {
	
	public ErrorResult() {
		super(false);
	}
	
	public ErrorResult(String message) {
		super(false,message);
		
	}

}
