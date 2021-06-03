package kodlamaio.northwind.entities.dtos;
//	Dto : Veri Transfer etme
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductWithCategoryDto {
	private int id;
	private String productName;
	private String CategoryName;
}
