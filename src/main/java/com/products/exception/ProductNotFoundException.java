package com.products.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @author sangeetha
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends Exception {

		private static final long serialVersionUID = 1L;

		public ProductNotFoundException(String errorMessage){
	    	super(errorMessage);
	    }
}
