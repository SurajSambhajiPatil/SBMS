package in.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "EMP_ADDRESS_DETAILS")
public class Address {

	@Id
	@Column(name = "ADDRESS_ID")
	private Integer addId;
	
	@Column(name = "EMP_ID")
	private Integer empId;
	
	@Column(name = "EMP_CITY")
	private String empCity;
	
	@Column(name = "EMP_STATE")
	private String empState;
	
	@Column(name = "EMP_COUNTRY")
	private  String empCountry;
	
	
}
