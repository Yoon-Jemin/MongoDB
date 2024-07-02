package study.mongodb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import study.mongodb.product.domain.Category;
import study.mongodb.product.domain.Product;
import study.mongodb.product.domain.repository.CategoryRepository;
import study.mongodb.product.domain.repository.ProductRepository;

@SpringBootApplication
public class MongoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDemoApplication.class, args);
	}


//	@Bean
	public CommandLineRunner commandLineRunner(
			ProductRepository productRepository,
			CategoryRepository categoryRepository
	){
		return args -> {
			Category category1 = Category.builder()
					.name("cat 1")
					.description("cat 1")
					.build();
			categoryRepository.insert(category1);

			Category category2 = Category.builder()
					.name("cat 2")
					.description("cat 2")
					.build();
			categoryRepository.insert(category2);

			Product product = Product.builder()
					.name("phone")
					.description("Iphone")
					.build();
//			productRepository.insert(product);
		};
	}
}
