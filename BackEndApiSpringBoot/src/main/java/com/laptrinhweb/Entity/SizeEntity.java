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
@Table(name = "size")
public class SizeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "size_id")
	private Long id;
	@Column()
	private Double size;

	@OneToMany(mappedBy = "size")
	private List<ProductSizeEntity> productSizes = new ArrayList<>();

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public List<ProductSizeEntity> getProductSizes() {
		return productSizes;
	}

	public void setProductSizes(List<ProductSizeEntity> productSizes) {
		this.productSizes = productSizes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SizeEntity() {
		super();
	}

	public SizeEntity(Long id, Double size, List<ProductSizeEntity> productSizes) {
		super();
		this.id = id;
		this.size = size;
		this.productSizes = productSizes;
	}

}
