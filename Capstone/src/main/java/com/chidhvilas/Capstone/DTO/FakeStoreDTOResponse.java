package com.chidhvilas.Capstone.DTO;

import com.chidhvilas.Capstone.models.Category;
import com.chidhvilas.Capstone.models.Product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreDTOResponse {
	private long id;
	private String title;
	private String description;
	private String image;
	private String category;
	private double price;
	
	public Product toProduct() {
		Product product=new Product();
		product.setId(id);
		product.setName(title);
		product.setDescription(description);
		product.setImage(image);
		product.setPrice(price);
		
		Category category1=new Category();
		category1.setName(category);
		product.setCategory(category1);
		return product;
	}
	

}
