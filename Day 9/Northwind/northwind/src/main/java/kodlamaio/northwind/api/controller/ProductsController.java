package kodlamaio.northwind.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;
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
	public DataResult<List<Product>> getAll(){
		
		return  this.productService.getAll();
		//	return new Result(true) this.productService.getAll();
		
	}
	
	@GetMapping("/getProductWithCategoryDetails")
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails(){	
		return  this.productService.getProductWithCategoryDetails();
		
	}
	
	@PostMapping("/add") 	//  kodlama.io/api/products/add diye bir 
							//  istekte bulunursam
							// o zaman burasi caliscak
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}
	
	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName){
		return this.productService.getByProductName(productName);
	}
	
	@GetMapping("/getByProductNameAndCategoryId")
	public DataResult<Product> 
	getByProductNameAndCategoryId(@RequestParam("productName") String productName,@RequestParam("categoryId") int categoryId){
		System.out.println(productName);
		System.out.println(categoryId);
		
		return this.productService.getByProductNameAndCategoryId
				(productName, categoryId);
	}
	
	@GetMapping("/getByProductNameContains")
	public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
		return this.productService.getByProductNameContains(productName);
	}
	
	@GetMapping("/getAllByPage")
	DataResult<List<Product>> getAll(int pageNo, int pageSize){
		return this.productService.getAll(pageNo, pageSize);
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<Product>> getAllSorted() {
		return this.productService.getAllSorted();
	}
	
	
}