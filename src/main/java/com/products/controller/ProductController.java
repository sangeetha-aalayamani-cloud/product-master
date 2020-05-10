package com.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.products.exception.ProductNotFoundException;
import com.products.model.Product;
import com.products.service.ProductService;

/**
 * 
 * @author sangeetha
 *
 */
@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@Autowired
    InMemoryUserDetailsManager inMemoryUserDetailsManager;


	/**
	 * Get all product details
	 * @return
	 */
	@RequestMapping(value="/getProductDetails", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public ResponseEntity<List<Product>> getProductDetails() {
		 List<Product> p = productService.retrieveProducts();
		 if (p.size() > 0) {		      
		      return new ResponseEntity<>(p, HttpStatus.OK);
		 } else {
			 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		 }
    }

	/**
	 * Get product by ID
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/getProductById/{id}",method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public ResponseEntity<Product> getProductById(@PathVariable("id") long id) throws ProductNotFoundException {
		Product o = productService.findById(id)
		.orElseThrow(() -> new ProductNotFoundException("Product not found for " + id));
		return new ResponseEntity<>(o, HttpStatus.OK);
	}
}