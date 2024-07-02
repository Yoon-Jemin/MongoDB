package study.mongodb.product.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import study.mongodb.product.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
