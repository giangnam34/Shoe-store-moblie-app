package com.laptrinhweb.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.laptrinhweb.Key.ProductColorKey;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "product_color")
public class ProductColorEntity {
	@EmbeddedId
	ProductColorKey id;

	@ManyToOne
	@MapsId("product_id")
	@JoinColumn(name = "product_id")
	private ProductEntity product;

	@ManyToOne
	@MapsId("color_id")
	@JoinColumn(name = "color_id")
	private ColorEntity color;

	private Long stock;

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public ColorEntity getColor() {
		return color;
	}

	public void setColor(ColorEntity color) {
		this.color = color;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	public ProductColorKey getId() {
		return id;
	}

	public void setId(ProductColorKey id) {
		this.id = id;
	}

	public ProductColorEntity() {
		super();
	}

	public ProductColorEntity(ProductColorKey id, ProductEntity product, ColorEntity color, Long stock) {
		super();
		this.id = id;
		this.product = product;
		this.color = color;
		this.stock = stock;
	}

}