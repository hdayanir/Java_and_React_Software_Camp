// github.com/hdayanir

package oopIntro;

public class Main {

	public static void main(String[] args) {
		//E-ticaret Site ornegi
		/*String[] products = { //ürünler
			"Lenovo V14",
			"Lenovo V15",
			"HP 5"
		}; 
		int[] unitsInStock  = { //stok adedi
				3,
				4,
				5
			};
		*/
		//bu kodlama sistemi önerilmez 
		//bunun yerine objelerle bu projeyi yapacaðýz
		
		Product product1 =new Product(1,"Lenovo V14",15000,"16GB Ram");//örnek olusturma , referans olusturma , instance
		
		Product product2 =new Product();//örnek olusturma , referans olusturma , instance
		product2.id=2;
		product2.name="Lenovo V15";
		product2.unitPrice=16000;
		product2.detail="32 GB Ram";
		
		Product product3 =new Product();//örnek olusturma , referans olusturma , instance
		product3.id=3;
		product3.name="hp 5";
		product3.unitPrice=10000;
		product3.detail="8 GB Ram";
		
		Product[] products = {product1,product2,product3};
		for (Product product : products) {
			System.out.println(product.name);
		}
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id =1;
		category1.name="Bilgisayar";
		
		Category category2 = new Category();
		category2.id =2;
		category2.name="Ev-Bahce";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);

		productManager.addToCart(product2);

		productManager.addToCart(product3);

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
