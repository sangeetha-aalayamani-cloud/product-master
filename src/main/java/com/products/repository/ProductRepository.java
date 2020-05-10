package com.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.model.Product;
/**
 * 
 * @author sangeetha
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
