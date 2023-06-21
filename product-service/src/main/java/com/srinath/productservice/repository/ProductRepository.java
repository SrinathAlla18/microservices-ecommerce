package com.srinath.productservice.repository;

import com.srinath.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository <Product, String> {
}
