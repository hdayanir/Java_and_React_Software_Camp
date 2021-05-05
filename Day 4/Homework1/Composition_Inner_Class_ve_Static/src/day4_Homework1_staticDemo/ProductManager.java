// github.com/hdayanir

package day4_Homework1_staticDemo;

public class ProductManager {  // NOT : Manager siniflari static yapilmaz.
	public void add(Product product) {
		ProductValidator validator = new ProductValidator();
		if(ProductValidator.isValid(product)) { // ProductValidator' e gonderilen product isValid ise yani true ise ekle demek
			System.out.println("Eklendi");
		}else {
			System.out.println("Urun bilgileri gecersiz oldugu icin eklenemedi");
		}
		}
}
