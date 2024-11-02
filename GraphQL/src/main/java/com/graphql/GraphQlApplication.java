package com.graphql;
import com.graphql.entity.Product;
import com.graphql.repository.ProductRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class GraphQlApplication {
	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(GraphQlApplication.class, args);

	}
	/*@PostConstruct
	public void initOb() {
		List<Product> products = Stream.of(
				new Product("Laptop", "Electronics", 73773.0f, 50),
				new Product("KeyBoard", "Electronics", 737.0f, 40),
				new Product("Mause", "Electronics", 300.0f, 30),
				new Product("chairs", "Furniture", 73773.3f, 20)
		).toList();
		productRepo.saveAll(products);
	}*/




}
