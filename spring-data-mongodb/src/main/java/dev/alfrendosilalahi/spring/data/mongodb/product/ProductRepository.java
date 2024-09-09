package dev.alfrendosilalahi.spring.data.mongodb.product;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
