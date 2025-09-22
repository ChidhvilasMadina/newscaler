package com.chidhvilas.Capstone.DTO;

import com.chidhvilas.Capstone.models.Category;
import com.chidhvilas.Capstone.models.Product;

public class CreateProductRequestDTO {
	private long id;
	private String title;
	private String description;
	private String imageURL;
	private Category category;
	private double price;
	
	public long getId() {
		return id;
	}	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
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



	public Product toProduct() {
		Product product=new Product();
		
		product.setName(title);
		product.setDescription(description);
		product.setImage(imageURL);
		product.setPrice(price);
		//Category category1=new Category();
		return product;
	}

}
