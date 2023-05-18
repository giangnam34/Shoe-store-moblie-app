package com.laptrinhweb.Service.Implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptrinhweb.Convert.Brand;
import com.laptrinhweb.DTO.BrandDTO;
import com.laptrinhweb.Entity.BrandEntity;
import com.laptrinhweb.Service.Interface.IBrandService;
import com.laptrinhweb.repository.BrandRepository;

@Service
public class BrandService implements IBrandService {
	@Autowired
	BrandRepository brandRepository;
	@Autowired
	Brand brand;
	
	@Override
	public List <BrandDTO> getAllBrand(){
		List <BrandDTO> result = new ArrayList <BrandDTO>();
		for (BrandEntity x: brandRepository.findAll()) {
			result.add(brand.toDTO(x));
		}
		return result;
	}
}
