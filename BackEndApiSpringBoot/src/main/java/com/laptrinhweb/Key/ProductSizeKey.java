package com.laptrinhweb.Key;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class ProductSizeKey implements Serializable{
	@Column(name = "product_id")
	private Long product_id;

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public Long getSize_id() {
		return size_id;
	}

	public void setSize_id(Long size_id) {
		this.size_id = size_id;
	}

	@Column(name = "size_id")
	private Long size_id;

}
