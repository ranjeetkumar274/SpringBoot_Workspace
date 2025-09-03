package com.ashu;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashu.entity.Product;
import com.ashu.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductRepository productRepo = context.getBean(ProductRepository.class);
		
		
//		Product p = new Product(102, "KeyBoard", 500.50);
//		
//		productRepo.save(p);
		
		
		List<Product> prods = productRepo.getProduct();
		
		prods.forEach(System.out::println);
		
	}

}
