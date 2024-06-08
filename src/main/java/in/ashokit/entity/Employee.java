package in.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "EMP_DETAILS")
public class Employee {

	@Id
	@Column(name = "EMP_ID")
	private Integer empId;
	
	@Column(name = "EMP_NAME")
	private String empName;
	
	@Column(name = "EMP_SAL")
	private double empSal;
}
