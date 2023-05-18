package com.laptrinhweb.Key;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@EqualsAndHashCode
@Component
public class ProductOrderKey implements Serializable {
	@Column(name = "product_id")
	private Long productid;
	@Column(name = "order_id")
	private Long orderid;
	public Long getProductid() {
		return productid;
	}
	public void setProductid(Long productid) {
		this.productid = productid;
	}
	public Long getOrderid() {
		return orderid;
	}
	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}
	public ProductOrderKey() {
		super();
	}
	public ProductOrderKey(Long productid, Long orderid) {
		super();
		this.productid = productid;
		this.orderid = orderid;
	}
	

	
}
