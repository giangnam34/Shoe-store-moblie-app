package com.laptrinhweb.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.laptrinhweb.Key.ProductOrderKey;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "product_order")
public class ProductOrderEntity {

	@EmbeddedId
	ProductOrderKey id;

	@ManyToOne
	@MapsId("product_id")
	@JoinColumn(name = "product_id")
	private ProductEntity product;

	@ManyToOne
	@MapsId("order_id")
	@JoinColumn(name = "order_id")
	private OrderEntity order;

	private Long quantity;

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public OrderEntity getOrder() {
		return order;
	}

	public void setOrder(OrderEntity order) {
		this.order = order;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public ProductOrderKey getId() {
		return id;
	}

	public void setId(ProductOrderKey id) {
		this.id = id;
	}

	public ProductOrderEntity() {
		super();
	}

	public ProductOrderEntity(ProductOrderKey id, ProductEntity product, OrderEntity order, Long quantity) {
		super();
		this.id = id;
		this.product = product;
		this.order = order;
		this.quantity = quantity;
	}

}
