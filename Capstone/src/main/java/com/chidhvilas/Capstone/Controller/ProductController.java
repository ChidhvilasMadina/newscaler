package com.chidhvilas.Capstone.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chidhvilas.Capstone.DTO.CreateProductRequestDTO;
import com.chidhvilas.Capstone.DTO.ProductResponseDTO;
import com.chidhvilas.Capstone.ExceptionHandler.ProductNotFoundException;
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
	public ProductResponseDTO getProductById(@PathVariable("id") long id) throws ProductNotFoundException {
		Product product=productService.getProductById(id);
		return ProductResponseDTO.res(product);
	}
	@GetMapping("/products")
	public List<ProductResponseDTO> getAllProducts() throws ProductNotFoundException{
		List<Product> products=productService.getAllProducts();
		
		List<ProductResponseDTO> prodResponseDTO=new ArrayList<>();
		for(Product p:products) {
			prodResponseDTO.add(ProductResponseDTO.res(p));
		}
		return prodResponseDTO;
	}
	
	@PostMapping("/products")
	public ResponseEntity<ProductResponseDTO> createProduct(@RequestBody CreateProductRequestDTO createProductRequestDTO) throws ProductNotFoundException {
		Product createpProductRequest=createProductRequestDTO.toProduct();
//		System.out.println("createProductRequestDTO "+createProductRequestDTO.getTitle()+" "+createProductRequestDTO.getDescription());
//		System.out.println("createProductRequest "+createpProductRequest.getName()+" "+createpProductRequest.getDescription());
		Product prod=productService.createProduct(createpProductRequest);
		ProductResponseDTO prodResDTO=ProductResponseDTO.res(prod);
		return ResponseEntity.status(HttpStatus.CREATED).body(prodResDTO);

		
	}
	@PutMapping("/products/{id}")
	public ResponseEntity<ProductResponseDTO> replaceProduct(@PathVariable("id") long id, @RequestBody CreateProductRequestDTO createProductRequestDTO) {
		//createProductRequestDTO.setId(id);
		
		System.out.println(createProductRequestDTO.getId()+" "+createProductRequestDTO.getTitle()+" "+createProductRequestDTO.getDescription());
		
		Product productRequest=createProductRequestDTO.toProduct();
		productRequest.setId(id);
		Product prod=productService.replace(productRequest);
		ProductResponseDTO prodResDTO=ProductResponseDTO.res(prod);
		System.out.println(createProductRequestDTO.getId()+" "+createProductRequestDTO.getTitle()+" "+createProductRequestDTO.getDescription());
		
		return ResponseEntity.status(HttpStatus.OK).body(prodResDTO);
		
	}
	
		
}
