// github.com/hdayanir

package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		System.out.println("--------- Java Dersi 31 - Field ve Attribute ile Calisma ------------");
		Product product =new Product();
		product.id=1;
		product.name="Laptop";
        product.desription="Asus Laptop";
        product.price=5000;
        product.stockAmount=3;
		System.out.println(product.name);
		
		System.out.println("---------------");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
	}

}
