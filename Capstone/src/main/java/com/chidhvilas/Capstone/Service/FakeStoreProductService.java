package com.chidhvilas.Capstone.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.chidhvilas.Capstone.DTO.FakeStoreDTOResponse;
import com.chidhvilas.Capstone.models.Product;

@Service
public class FakeStoreProductService implements ProductService {
	
	RestTemplate restTemplate;
	
	 public FakeStoreProductService(RestTemplate restTemplate) {
		 this.restTemplate=restTemplate;
	 }
	 
	 @Override
	 public Product getProductById(long id) {
		 FakeStoreDTOResponse fakeStoreDTOResponce=restTemplate.getForObject("https://fakestoreapi.com/products/"+id, FakeStoreDTOResponse.class);
		 return fakeStoreDTOResponce.toProduct();
		
	 }
}
