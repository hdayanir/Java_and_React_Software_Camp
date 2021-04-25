// github.com/hdayanir

package oopIntro;

public class Product {
	public Product() { 	// bu bloga consructor kýsacasý bu classý olusturdugumuzda 
						//olmasýný istedigimiz bir kod varsa o kod buraya yazilir.
		System.out.println("Ben calistim");
	}
	
	public Product(int id,String name,double unitPrice,String detail) { 	
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	int id;
	String name ;
	double unitPrice;	//birim fiyati
	String detail;		//detayi
	
}
