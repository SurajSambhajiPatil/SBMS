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
		p1.setPname("Mouse");
	    p1.setPrice(200);
		
		repository.save(p1);
	}

}
