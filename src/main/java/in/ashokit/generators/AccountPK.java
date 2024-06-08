package in.ashokit.generators;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AccountPK implements Serializable {

	private Integer accId;
	
	private String acccType;
	
	private String holderName;
	
}
