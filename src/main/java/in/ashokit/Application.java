package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.Entity.Product;
import in.ashokit.Repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductRepository repository = context.getBean(ProductRepository.class);
		
		Product p1 = new Product();
		p1.setPid(104);
		p1.setPname("SSD");
	
		
		repository.save(p1);
	}

}
