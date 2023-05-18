package com.laptrinhweb.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Long id;

	@Column()
	private String name;

	@Column()
	private Long money;

	@Column(name = "sold_quantity")
	private Long sold_quantity;

	@Column()
	private Double discount;

	@Column()
	private Long stock;

	@Column()
	private String description;

	@OneToMany(mappedBy = "product")
	private List<ProductOrderEntity> productOrders = new ArrayList<>();

	@OneToMany(mappedBy = "product")
	private List<ProductColorEntity> productColors = new ArrayList<>();

	@OneToMany(mappedBy = "product")
	private List<ProductSizeEntity> productSizes = new ArrayList<>();

	@ManyToMany()
	@JoinTable(name = "product_image", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "image_id"))
	private List<ImageEntity> images = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private CategoryEntity category;

	@ManyToOne
	@JoinColumn(name = "brand_id", nullable = false)
	private BrandEntity brand;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMoney() {
		return money;
	}

	public void setMoney(Long money) {
		this.money = money;
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

	public List<ProductOrderEntity> getProductOrders() {
		return productOrders;
	}

	public void setProductOrders(List<ProductOrderEntity> productOrders) {
		this.productOrders = productOrders;
	}

	public List<ProductSizeEntity> getProductSizes() {
		return productSizes;
	}

	public void setProductSizes(List<ProductSizeEntity> productSizes) {
		this.productSizes = productSizes;
	}

	public List<ImageEntity> getImages() {
		return images;
	}

	public void setImages(List<ImageEntity> images) {
		this.images = images;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public BrandEntity getBrand() {
		return brand;
	}

	public void setBrand(BrandEntity brand) {
		this.brand = brand;
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

	public ProductEntity() {
		super();
	}

	public ProductEntity(Long id, String name, Long money, Long sold_quantity, Double discount, Long stock,
			String description, List<ProductOrderEntity> productOrders, List<ProductColorEntity> productColors,
			List<ProductSizeEntity> productSizes, List<ImageEntity> images, CategoryEntity category,
			BrandEntity brand) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
		this.sold_quantity = sold_quantity;
		this.discount = discount;
		this.stock = stock;
		this.description = description;
		this.productOrders = productOrders;
		this.productColors = productColors;
		this.productSizes = productSizes;
		this.images = images;
		this.category = category;
		this.brand = brand;
	}

}
