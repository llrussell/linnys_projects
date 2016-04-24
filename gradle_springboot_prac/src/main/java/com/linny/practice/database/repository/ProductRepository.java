package com.linny.practice.database.repository;

import com.linny.practice.database.entity.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by russelll on 4/24/16.
 */
public interface ProductRepository  extends CrudRepository<Product, Integer>{

}
