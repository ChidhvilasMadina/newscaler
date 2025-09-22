package com.chidhvilas.Capstone.DTO;

import com.chidhvilas.Capstone.models.Category;

public class FakeStoreRequestDTO {
	
	private String title;
	private String description;
	private String image;
	private String category;
	private double price;
	
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String string) {
		this.category = string;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
