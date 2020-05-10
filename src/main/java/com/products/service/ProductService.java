package com.products.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.model.Product;
import com.products.repository.ProductRepository;
/**
 * 
 * @author sangeetha
 *
 */
@Service
public class ProductService {
	
	@Autowired
    private ProductRepository productRepository;

	/**
     * Get all product details
     * @return
     */
    public List<Product> retrieveProducts() {
    	List<Product> product = new ArrayList<>();
    	productRepository.findAll().forEach(product::add);
        return product;
    }

    /**
     * fetch product details by id
     * @param id
     * @return 
     */
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }    
}