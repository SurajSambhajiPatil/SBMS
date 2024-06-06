package in.ashokit.Entity;

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


@Data
@Entity
@Table(name="USER_GUIDE")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@Column(name = "User_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name = "User_Name")
	private String name;
	
	@Column(name = "User_Age")
	private Integer age;
	
	@Column(name = "User_Location")
	private String location;
	
	

}
