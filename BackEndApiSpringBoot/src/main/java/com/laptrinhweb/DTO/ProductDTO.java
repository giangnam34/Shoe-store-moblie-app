package com.laptrinhweb.DTO;

import java.util.List;

import javax.persistence.Column;

public class ProductDTO {

	private Long id;
	private String name;
	private Long price;
	private Long sold_quantity;
	private Double discount;
	private Long stock;
	private String description;
	private List <String> color;
	private List <Double> size;
	private String image;
	private String category;
	private String brand;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Long getSold_quantity() {
		return sold_quantity;
	}
	public void setSold_quantity(Long sold_quantity) {
		this.sold_quantity = sold_quantity;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Long getStock() {
		return stock;
	}
	public void setStock(Long stock) {
		this.stock = stock;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getColor() {
		return color;
	}
	public void setColor(List<String> color) {
		this.color = color;
	}
	public List<Double> getSize() {
		return size;
	}
	public void setSize(List<Double> size) {
		this.size = size;
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
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public ProductDTO() {
		super();
	}
	public ProductDTO(Long id, String name, Long money, Long sold_quantity, Double discount, Long stock,
			String description, List<String> color, List<Double> size) {
		super();
		this.id = id;
		this.name = name;
		this.price = money;
		this.sold_quantity = sold_quantity;
		this.discount = discount;
		this.stock = stock;
		this.description = description;
		this.color = color;
		this.size = size;
	}
	
}
