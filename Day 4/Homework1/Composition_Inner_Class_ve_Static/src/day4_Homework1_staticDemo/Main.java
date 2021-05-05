// github.com/hdayanir

package day4_Homework1_staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 10;
		product.name= "Mouse";
		manager.add(product);
		
		Product product1 = new Product();
		product1.price = 10;
		product1.name= "";
		manager.add(product1);
		
		DatabaseHelper.Crud.Delete();
		DatabaseHelper.Connection.createConnection();
		// Bu tip yapilar onerilmez .
		// Cunku her is icin farkli classlar olusturulmali
		// Mesela Crud() icin farkli bir class olmali
		// createConnection() için farkli bir class olusturulmali
		// O zaman temiz bir kod olabilir.
		
	}

}
