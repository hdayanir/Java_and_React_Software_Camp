// github.com/hdayanir

package day4_Homework1_staticDemo;
//Bir urunu kaydederken , güncellerken urunun kurallra uygun olup olmadıgını  bulmak icin kullanacagımız class
public class ProductValidator {// Ana class static olamaz . Alt siniflar static yapilabilir.
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {//urunun kaydedilebilmesi icin o urunun fiyatinin
								// 0' dan buyuk olmasi ve isminin de verilmis olmasi lazim
		 	return true;
		}
		else {
			return false;
		}
	}
}
