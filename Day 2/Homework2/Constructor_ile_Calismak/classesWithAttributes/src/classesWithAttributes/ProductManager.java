// github.com/hdayanir

package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		//JDBC
		System.out.println("Ürün eklendi: " + product.getName());
	}
	
	public void Add2(int id,String name,String desription,double price,int stockAmount) {
		System.out.println("Ürün eklendi: " +name);

	}
}
