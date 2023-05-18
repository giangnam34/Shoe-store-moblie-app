package com.laptrinhweb.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.laptrinhweb.Key.ProductSizeKey;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "product_size")
public class ProductSizeEntity {
	@EmbeddedId
	ProductSizeKey id;

	@ManyToOne
	@MapsId("product_id")
	@JoinColumn(name = "product_id")
	private ProductEntity product;

	@ManyToOne
	@MapsId("size_id")
	@JoinColumn(name = "size_id")
	private SizeEntity size;

	private Long quantity;

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public SizeEntity getSize() {
		return size;
	}

	public void setSize(SizeEntity size) {
		this.size = size;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public ProductSizeKey getId() {
		return id;
	}

	public void setId(ProductSizeKey id) {
		this.id = id;
	}

	public ProductSizeEntity() {
		super();
	}

	public ProductSizeEntity(ProductSizeKey id, ProductEntity product, SizeEntity size, Long quantity) {
		super();
		this.id = id;
		this.product = product;
		this.size = size;
		this.quantity = quantity;
	}

}
