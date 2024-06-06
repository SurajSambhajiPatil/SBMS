package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ashokit.Entity.User;
import in.ashokit.Repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserRepository repository = context.getBean(UserRepository.class);
		
		//To add Multiple record into a table
	    //User u1 =new User( 101,"Aarya", 4, "Pune");
	    User u2 =new User( 102,"Aarav", 14, "Sangli");
	    User u3 =new User( 103,"Rutu", 25, "Sangli");
	   User u4 =new User( 104,"Rohit",22, "Kolhapur");
	    User u5 =new User( 105,"Swapna", 27, "Mumbai");
	    User u6 =new User(106, "Sanskar", 9, "Delhi");
		
// 1)JPA Repository method that used to sort method
	   // repository.saveAll(Arrays.asList(u2,u3,u4,u5,u6));
		List<User> findByUser = repository.findAll(Sort.by("name","age").ascending());
		
		//findByUser.forEach(user->{System.out.println(user);});

// 2)Pagination
		// PAGE NUMBER (User landed on which page)
		// PAGE SIZE (How many records should be displayed in single page)
		
		  int pageSize = 3; int pageNum = 2; PageRequest pageRequest =
		  PageRequest.of(pageNum - 1, pageSize); Page<User> findAll =
		  repository.findAll(pageRequest);
		  
		  findAll.forEach(user -> { System.out.println(user); });
		 
		
// 3)QBE (Query By Example)
		User entity = new User();
		entity.setLocation("Sangli");
		entity.setAge(25);
		
		
		Example<User> example=Example.of(entity);
		List<User> findAll1 = repository.findAll(example);
		
		findAll1.forEach(user->{
			System.out.println(user);
		});
		
		
	}

}
