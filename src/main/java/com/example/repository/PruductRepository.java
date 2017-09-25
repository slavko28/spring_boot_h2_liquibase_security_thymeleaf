package com.example.repository;

import com.example.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface PruductRepository extends CrudRepository<Product, Integer> {
}
