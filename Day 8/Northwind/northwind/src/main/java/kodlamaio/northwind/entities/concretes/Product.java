
package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity    //entity derken bir veritabani nesnesi oldugunu belitmis oluyoruz.
@Table(name="products")//veritabaninda hangi veritabanina karsilik geliyor onu belirtiyoruz.
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //otomatik id eklemek
	@Column(name="product_id") // veritabaninda hangi kolona karsilik geliyor onu belirtiyoruz.
	private int id;
	
	//@Column(name="category_id")
	//private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;//aciklama kismi olarak dusunulebilir.

	@ManyToOne()
    @JoinColumn(name="category_id")
			// Burada iliskili oldugu tabloyla olan iliskisinin nasil oldugunu belirtiyoruz.
    private Category category;

}
