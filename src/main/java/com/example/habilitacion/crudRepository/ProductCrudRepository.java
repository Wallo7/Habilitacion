package com.example.habilitacion.crudRepository;

import com.example.habilitacion.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCrudRepository extends MongoRepository<Product,String> {
}
