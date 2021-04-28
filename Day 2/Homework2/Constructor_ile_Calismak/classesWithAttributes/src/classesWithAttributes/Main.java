// github.com/hdayanir

package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		System.out.println("--------- Java Dersi 31 - Field ve Attribute ile Calisma ------------");
		Product product1 =new Product(1,"Telefon","Xiaomi Telefon",3054,1);
		Product product2 =new Product();
		product2.setId(1);
		product2.setName("Laptop");
        product2.setDesription("Asus Laptop");
        product2.setPrice(5000);
        product2.setStockAmount(3);
		System.out.println(product2.getName());
		
		System.out.println("---------------");

		ProductManager productManager = new ProductManager();
		productManager.Add(product1);
		productManager.Add(product2);
		
		productManager.Add2(1, "Masaüstü", "Acer", 10000, 34);
		System.out.println(product2.getId()+" id li ürünün kodu : " +"'"+product2.getKod()+"");
	}

}
