package com.laptrinhweb.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "color")
public class ColorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "color_id")
	private Long id;

	@Column()
	private String color;

	@OneToMany(mappedBy = "color")
	private List<ProductColorEntity> productColors = new ArrayList<>();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Long getId() {
		return id;
	}

	public List<ProductColorEntity> getProductColors() {
		return productColors;
	}

	public void setProductColors(List<ProductColorEntity> productColors) {
		this.productColors = productColors;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ColorEntity() {
		super();
	}

	public ColorEntity(Long id, String color, List<ProductColorEntity> productColors) {
		super();
		this.id = id;
		this.color = color;
		this.productColors = productColors;
	}

}
