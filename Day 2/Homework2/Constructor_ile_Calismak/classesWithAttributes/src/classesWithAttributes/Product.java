// github.com/hdayanir

package classesWithAttributes;

public class Product {
	
	public Product(int _id, String _name,String _desription, double _price,int _stockAmount) {//Constructor
		System.out.println("Yapici blok calisti.");
		this._id=_id;
		this._name=_name;
		this._desription=_desription;
		this._price=_price;
		this._stockAmount=_stockAmount;
		
	}
	public Product() {
		System.out.println("Yapici blok calisti.");
	}
	
	//Attritube and field
	private int _id; 
	private String _name;
	private String _desription;
	private double _price;
	private int _stockAmount;
	private String _kod;//name' in bas harfi ve id' de oluþan sadece okunabilir bir alan
	
	//getter
	public int getId() {
		return _id;
	}
	
	//setter
	public void setId(int id) {
		_id =id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	
	public String getDesription() {
		return _desription;
	}

	public void setDesription(String desription) {
		this._desription = desription;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		this._price = price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int sstockAmount) {
		this._stockAmount = sstockAmount;
	}

	public String getKod() {
		return this._name.substring(0,1) + this._id;
	}

	

	
	}
	

