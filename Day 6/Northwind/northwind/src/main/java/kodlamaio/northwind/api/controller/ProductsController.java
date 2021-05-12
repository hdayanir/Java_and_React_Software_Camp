package kodlamaio.northwind.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController //sen vir Controller 'sin demektir. Spring ile ilgili
@RequestMapping("/api/products") //farkli islemler icin farkli controller yapilabilir
		//burada "/api/products" boyle bir adres uzerinden istek gelirse onu karsilayacak
		//olan budur "ProductsController" diyoruz. 
public class ProductsController {
	
	private ProductService productService;
	
	
	@Autowired //ProductService productService nesnesi lazim oldugu icin projeyi tariyor
					//ve o kimi implement etmis ise bizim yerimize gerekli new ' lemeleri yapmaktadir
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}



	@GetMapping("/getall") //  kodlama.io/api/products/getall diye bir istekte bulunursam
				// o zaman burasi caliscak
	public List<Product> getAll(){
		
		return this.productService.getAll();
		
	}
}
//kodlama.io/api/products