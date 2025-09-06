package com.chidhvilas.Capstone.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chidhvilas.Capstone.DTO.ProductResponseDTO;
import com.chidhvilas.Capstone.Service.FakeStoreProductService;
import com.chidhvilas.Capstone.Service.ProductService;
import com.chidhvilas.Capstone.models.Product;

@RestController
@RequestMapping("/V1")
public class ProductController {
	
	/*
	 * public FakeStoreProductService fakeStoreProductService;
	 * 
	 * public ProductController(FakeStoreProductService fakeStoreProductService) {
	 * this.fakeStoreProductService=fakeStoreProductService; }
	 */
	public ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService=productService;
	}
	
	
	@GetMapping("/product/{id}")
	public ProductResponseDTO getProductById(@PathVariable("id") long id) {
		Product product=productService.getProductById(id);
		return ProductResponseDTO.res(product);
	}

}
