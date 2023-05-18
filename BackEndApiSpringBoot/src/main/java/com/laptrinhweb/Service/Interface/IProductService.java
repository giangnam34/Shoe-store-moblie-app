package com.laptrinhweb.Service.Interface;

import java.util.List;

import com.laptrinhweb.DTO.ProductDTO;

public interface IProductService {
	List <ProductDTO> getAllProduct();

	List<ProductDTO> getByBrand(List<ProductDTO> product, String brandname);

	List<ProductDTO> getByCategory(List<ProductDTO> product, String category);

	List<ProductDTO> sortBy(List<ProductDTO> product, String sort);

	List<ProductDTO> searchBy(List<ProductDTO> product, String search);

	ProductDTO findbyId(String pid);

}
