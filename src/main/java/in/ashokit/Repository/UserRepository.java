package in.ashokit.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	
	
}
