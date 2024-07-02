package study.mongodb.product.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.mongodb.product.domain.Product;
import study.mongodb.product.domain.repository.ProductRepository;

import java.security.PublicKey;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public String save(Product product){
        // use a DTO
        // validate the object
        return productRepository.save(product).getId();
    }

    public Product findById(String id){
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public void delete(String id){
        productRepository.deleteById(id);
    }
}
