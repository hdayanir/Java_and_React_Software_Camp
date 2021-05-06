// github.com/hdayanir

package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

// is kodlari yazilir
public class ProductManager implements ProductService{
	
		private ProductDao productDao ;
		
		// Jlogger ' i baskasinin yazmis oldugu bir kod blogu olarak düsünelim . 
		// Biz bunu kendi projemize eklemek istiyoruz.
		// Oradaki kodlara hic dokunmadan bunu yapmamiz lazim
		
		private LoggerService loggerService; 
		
		public ProductManager(ProductDao productDao, LoggerService loggerService) {
			super();
			this.productDao=productDao;
			this.loggerService= loggerService;
		}
				
		@Override
		public void add(Product product) {
			if(product.getCetegoryId()==1) {
			System.out.println("Bu kategoride urun kabul edilmiyor.");
			return;
		}
			this.productDao.add(product);
			this.loggerService.logToSystem("Ürün eklendi : " + product.getName());
		
		}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
