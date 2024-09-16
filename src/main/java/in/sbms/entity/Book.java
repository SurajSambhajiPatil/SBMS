package in.sbms.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "BookDetails")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Book_Id")
	private Integer bookId;
	
	@Column(name = "Book_Name")
	private String bookName;
	
	@Column(name = "Book_Price")
	private Double bookPrice;
	
}
