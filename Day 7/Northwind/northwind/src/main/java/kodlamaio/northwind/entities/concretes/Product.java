package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity    //entity derken bir veritabani nesnesi oldugunu belitmis oluyoruz.
@Table(name="products")//veritabaninda hangi veritabanina karsilik geliyor onu belirtiyoruz.
@Data
public class Product {
	@Id
	@GeneratedValue //otomatik id eklemek
	@Column(name="product_id") // veritabaninda hangi kolona karsilik geliyor onu belirtiyoruz.
	private int id;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;//aciklama kismi olarak dusunulebilir.
	
	public Product() {}
	public Product(int id, int categoryId, String productName, double unitPrice, short unitInStock,
			String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitInStock = unitInStock;
		this.quantityPerUnit = quantityPerUnit;
	}
	
}
