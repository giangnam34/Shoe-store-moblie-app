package com.laptrinhweb.Service.Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhweb.Convert.Product;
import com.laptrinhweb.DTO.ProductDTO;
import com.laptrinhweb.Entity.ProductEntity;
import com.laptrinhweb.Service.Interface.IProductService;
import com.laptrinhweb.repository.ProductRepository;

@Service
public class ProductService implements IProductService {
	@Autowired
	ProductRepository productRepository;
	@Autowired
	Product productconvert;
	
	@Override
	public List<ProductDTO> getAllProduct(){
		List <ProductDTO> product = new ArrayList <ProductDTO>();
		for (ProductEntity x: productRepository.findAll()) {
			product.add(productconvert.toDTO(x));
		}
		return product;
	}
	@Override
	public List<ProductDTO> getByBrand(List <ProductDTO> product,String brandname){
		List <ProductDTO> result = new ArrayList <ProductDTO>();
		for (ProductDTO x: product) {
			if (x.getBrand().equals(brandname)) result.add(x);
		}
		return result;
	}
	@Override
	public List<ProductDTO> getByCategory(List <ProductDTO> product, String category){
		List <ProductDTO> result = new ArrayList <ProductDTO>();
		for (ProductDTO x: product) {
			if (x.getCategory().equals(category)) result.add(x);
		}
		return result;
	}
	@Override
	public List<ProductDTO> sortBy(List <ProductDTO> product, String sort){
		List <ProductDTO> result = new ArrayList <ProductDTO>();
		Comparator <ProductDTO> compare = Comparator.comparing(ProductDTO::getPrice).thenComparing(ProductDTO::getName);
		result = product.stream().sorted(compare).collect(Collectors.toList());
		if (sort.equals("dec")) Collections.reverse(result);
		return result;
	}
	@Override
	public List<ProductDTO> searchBy(List <ProductDTO> product, String search){
		List <ProductDTO> result = new ArrayList <ProductDTO>();
		for (ProductDTO x: product) {
			if (x.getName().toUpperCase().contains(search.toUpperCase()) || x.getPrice().toString().toUpperCase().contains(search.toUpperCase()) 
				|| x.getDiscount().toString().toUpperCase().equals(search.toUpperCase())
				|| x.getCategory().toUpperCase().contains(search.toUpperCase())
				|| x.getBrand().toUpperCase().contains(search.toUpperCase()))
			result.add(x);
		}
		return result;
	}
	@Override
	public ProductDTO findbyId(String pid) {
		int id = Integer.parseInt(pid);
		return productconvert.toDTO(productRepository.findById((long)id).get());
	}
}
