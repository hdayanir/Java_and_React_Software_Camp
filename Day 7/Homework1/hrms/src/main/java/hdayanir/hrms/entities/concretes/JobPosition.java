// github.com/hdayanir

package hdayanir.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data				//	getter setter olusturuyor.
@Entity 			// 	Entity interface 'ini  implements ediyor.
@Table(name="job_titles") //	veritaninda bir tabloya karsililk geldigini belirtiyoruz.
@NoArgsConstructor	//	parametresiz consructor eklemeye yariyor.
@AllArgsConstructor	//	butun parametrelerin eklendigi  consructor eklemeye yariyor.

public class JobPosition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // veritabani ile haberlesme yaparak 
		// bilgileri esitledikten sonra id carpismasini ortadan kaldirmak icin kullanilir. 
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
}
