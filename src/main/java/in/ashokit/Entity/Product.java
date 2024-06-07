package in.ashokit.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="PRODUCT_MASTER")
public class Product {

	@Id
	@Column(name = "PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	
	@Column(name = "PRODUCT_NAME")
	private String pname;
	
	@Column(name = "PRODUCT_PRICE")
	private Integer price;
	
	@CreationTimestamp
	@Column(name = "CREATED_DATE" , updatable = false)
	private LocalDateTime createdDate;
	
	@UpdateTimestamp
	@Column(name = "UPDATED_BY" , insertable = false)
	private LocalDateTime updatedDate;
	
	
	
}
