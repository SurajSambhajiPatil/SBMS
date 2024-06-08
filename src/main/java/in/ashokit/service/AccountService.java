package in.ashokit.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Account;
import in.ashokit.generators.AccountPK;
import in.ashokit.repository.AccountReposiitory;

@Service
public class AccountService {

	AccountReposiitory accRepo ;
	public AccountService(AccountReposiitory accRepo) {
		this.accRepo = accRepo;
	}
	
	public void getDataUsingPK() {
		AccountPK pk =new AccountPK();
		pk.setAccId(101);
		pk.setAcccType("Saving");
		pk.setHolderName("TCS");
		
		Optional<Account> findById = accRepo.findById(pk);
		
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
		
	}
	
	public void saveAccData() {
		
		AccountPK pk =new AccountPK();
		pk.setAccId(101);
		pk.setAcccType("Saving");
		pk.setHolderName("TCS");
		
		Account acc = new Account();
		acc.setBranchName("Sangli");
		acc.setMinBal(5000.50);
		
		acc.setAccPK(pk);
		accRepo.save(acc);
	}
}
