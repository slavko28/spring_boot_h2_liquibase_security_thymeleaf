package com.example.service;

import com.example.model.Product;

public interface ProductService {


    /**
     * Save entity.
     *
     * @param product entity to save.
     * @return saved entity with id
     */
    Product save(Product product);

    /**
     * Find entity by id.
     *
     * @param id the id entity to find
     * @return th entity
     */
    Product getById(Integer id);

    /**
     * Find all stored entities.
     *
     * @return the list of entities
     */
    Iterable<Product> getAll();

    /**
     * Delete entity by id.
     *
     * @param id the id entity to delete
     */
    void delete(Integer id);


}
