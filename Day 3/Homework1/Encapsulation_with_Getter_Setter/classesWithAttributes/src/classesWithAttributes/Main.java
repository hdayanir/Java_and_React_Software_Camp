// github.com/hdayanir

package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		System.out.println("--------- Java Dersi 31 - Field ve Attribute ile Calisma ------------");
		Product product =new Product();
		product.setId(1);
		product.setName("Laptop");
        product.setDesription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
		System.out.println(product.getName());
		
		System.out.println("---------------");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		productManager.Add2(1, "Masaüstü", "Acer", 10000, 34);
		System.out.println(product.getId()+" id li ürünün kodu : " +"'"+product.getKod()+"'");
	}

}
