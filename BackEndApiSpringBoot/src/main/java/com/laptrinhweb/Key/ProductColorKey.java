package com.laptrinhweb.Key;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@EqualsAndHashCode
public class ProductColorKey implements Serializable {
	@Column(name = "product_id")
	private Long product_id;

	public Long getProduct_id() {
		return product_id;
	}

	public Long getColor_id() {
		return color_id;
	}

	@Column(name = "color_id")
	private Long color_id;
}
