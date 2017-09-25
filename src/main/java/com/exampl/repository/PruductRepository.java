package com.exampl.repository;

import com.exampl.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface PruductRepository extends CrudRepository<Product, Integer> {
}
