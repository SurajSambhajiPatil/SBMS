package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Account;

public interface AccountReposiitory extends JpaRepository<Account, Serializable> {

}
