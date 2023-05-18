package com.laptrinhweb.Convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhweb.DTO.ProductDTO;
import com.laptrinhweb.Entity.ImageEntity;
import com.laptrinhweb.Entity.ProductColorEntity;
import com.laptrinhweb.Entity.ProductEntity;
import com.laptrinhweb.Entity.ProductSizeEntity;
import com.laptrinhweb.repository.ProductRepository;

@Component
public class Product {

	@Autowired 
	ProductRepository productRepository;
	public ProductEntity toEntity(ProductDTO product) {
		ProductEntity productEntity = new ProductEntity();
		productEntity = productRepository.findById(product.getId()).get();
		return productEntity;
	}
	public ProductDTO toDTO(ProductEntity product) {
		ProductDTO productDTO = new ProductDTO();
		List <String> color = new ArrayList<String>();
		for (ProductColorEntity x: product.getProductColors()) {
			color.add(x.getColor().getColor());
		}
		productDTO.setColor(color);
		productDTO.setDescription(product.getDescription());
		productDTO.setDiscount(product.getDiscount());
		productDTO.setId(product.getId());
		productDTO.setPrice(product.getMoney());
		productDTO.setName(product.getName());
		List <Double> size = new ArrayList<Double>();
		for (ProductSizeEntity x: product.getProductSizes()) {
			size.add(x.getSize().getSize());
		}
		productDTO.setSize(size);
		productDTO.setSold_quantity(product.getSold_quantity());
		productDTO.setStock(product.getStock());
		List <ImageEntity> image = new ArrayList<ImageEntity>();
		image = product.getImages();
		productDTO.setImage(image.get(0).getImage());
		productDTO.setBrand(product.getBrand().getName());
		productDTO.setCategory(product.getCategory().getName());
		return productDTO;
	}
}
