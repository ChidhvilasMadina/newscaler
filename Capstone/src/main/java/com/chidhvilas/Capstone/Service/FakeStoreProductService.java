package com.chidhvilas.Capstone.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.chidhvilas.Capstone.DTO.CreateProductRequestDTO;
import com.chidhvilas.Capstone.DTO.FakeStoreDTOResponse;
import com.chidhvilas.Capstone.DTO.FakeStoreRequestDTO;
import com.chidhvilas.Capstone.ExceptionHandler.ProductNotFoundException;
import com.chidhvilas.Capstone.models.Product;

@Service
public class FakeStoreProductService implements ProductService {
	
	RestTemplate restTemplate;
	
	 public FakeStoreProductService(RestTemplate restTemplate) {
		 this.restTemplate=restTemplate;
	 }
	 
	 @Override
	 public Product getProductById(long id) throws ProductNotFoundException {
		 FakeStoreDTOResponse fakeStoreDTOResponce=restTemplate.getForObject("https://fakestoreapi.com/products/"+id, FakeStoreDTOResponse.class);
		 if(fakeStoreDTOResponce==null) {
			 throw new ProductNotFoundException("product with id "+id+" not found");
		 }
		 return fakeStoreDTOResponce.toProduct();
		
	 }
	 @Override
	 public List<Product> getAllProducts() throws ProductNotFoundException{
		 FakeStoreDTOResponse[] fakeStoreDTOResponse= restTemplate.getForObject("https://fakestoreapi.com/products", FakeStoreDTOResponse[].class);
		 if(fakeStoreDTOResponse==null) {
			 throw new ProductNotFoundException("No products found");
		 }
		 List<Product> products=new ArrayList<>();
		 for(FakeStoreDTOResponse fakedto:fakeStoreDTOResponse) {
			 products.add(fakedto.toProduct());
		 }	 
		 return products;
	 }

	 @Override
	 public Product createProduct(Product createProductRequest) throws ProductNotFoundException {
		 FakeStoreRequestDTO fakestoreRequestDTO =createRequestParams(createProductRequest);
		FakeStoreDTOResponse fakeStoreDTOResponse=restTemplate.postForObject("https://fakestoreapi.com/products", fakestoreRequestDTO, FakeStoreDTOResponse.class);
		 if(fakeStoreDTOResponse==null) {
			 throw new RuntimeException("Product creation failed");
		 }		
		return fakeStoreDTOResponse.toProduct();
	 }

	 private FakeStoreRequestDTO createRequestParams(Product createProductRequest) {
		 FakeStoreRequestDTO fakeStoreRequestDTO=new FakeStoreRequestDTO();
		 fakeStoreRequestDTO.setTitle(createProductRequest.getName());
		 fakeStoreRequestDTO.setPrice(createProductRequest.getPrice());
		 fakeStoreRequestDTO.setDescription(createProductRequest.getDescription());
		 //fakeStoreRequestDTO.setCategory(createProductRequest.getCategory());
		 fakeStoreRequestDTO.setImage(createProductRequest.getImage());
		 if (createProductRequest.getCategory() != null) {
		        fakeStoreRequestDTO.setCategory(createProductRequest.getCategory().getName());
		    }
		 
		 return fakeStoreRequestDTO;
	 }
	 @Override
	 public Product replace(Product productRequest) {
		 FakeStoreRequestDTO fakestoreRequestDTO =createRequestParams(productRequest);
		 ResponseEntity<FakeStoreDTOResponse> response=restTemplate.exchange("https://fakestoreapi.com/products/"+productRequest.getId(), HttpMethod.PUT,
                 new HttpEntity<>(fakestoreRequestDTO), FakeStoreDTOResponse.class);
		 restTemplate.put("https://fakestoreapi.com/products/"+productRequest.getId(), fakestoreRequestDTO,FakeStoreDTOResponse.class);
		 FakeStoreDTOResponse fakeStoreDTOResponse = response.getBody();
		 if(fakeStoreDTOResponse==null) {
			 throw new RuntimeException("Product creation failed");
		 }
		 return fakeStoreDTOResponse.toProduct();
		}
		
	 
}
