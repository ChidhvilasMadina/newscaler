package com.chidhvilas.Capstone.DTO;

import com.chidhvilas.Capstone.models.Category;
import com.chidhvilas.Capstone.models.Product;

public class ProductResponseDTO {
	
	private long id;
	private String name;
	private String description;
	private String imageURL;
	private Category category;
	private double price;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	public static ProductResponseDTO res(Product product) {
		ProductResponseDTO prodResDTO= new ProductResponseDTO();
		prodResDTO.setId(product.getId());
		prodResDTO.setName(product.getName());
		prodResDTO.setDescription(product.getDescription());
		prodResDTO.setImageURL(product.getImage());
		prodResDTO.setPrice(product.getPrice());
		prodResDTO.setCategory(product.getCategory());
		
		return prodResDTO;
	}
	

}
