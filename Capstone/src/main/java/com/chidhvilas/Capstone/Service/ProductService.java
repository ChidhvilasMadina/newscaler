package com.chidhvilas.Capstone.Service;

import java.util.List;

//import com.chidhvilas.Capstone.Controller.List;
import com.chidhvilas.Capstone.ExceptionHandler.ProductNotFoundException;
import com.chidhvilas.Capstone.models.Product;

public interface ProductService {
	
	Product getProductById(long id) throws ProductNotFoundException;

	List<Product> getAllProducts() throws ProductNotFoundException;
	
	Product createProduct(Product createProductRequest) throws ProductNotFoundException;

	public Product replace(Product productRequest);

}
