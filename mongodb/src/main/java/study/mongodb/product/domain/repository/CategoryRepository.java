package study.mongodb.product.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import study.mongodb.product.domain.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {
}
