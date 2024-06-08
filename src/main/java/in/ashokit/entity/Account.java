package in.ashokit.entity;

import in.ashokit.generators.AccountPK;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
@Table(name="BANK_ACCOUNTS")
public class Account {

	@Column(name = "BRANCH_NAME")
	private String branchName;
	
	@Column(name = "MIN_BALANCE")
	private double minBal;
	
	@EmbeddedId
	private AccountPK accPK;
	
}
