package com.laptrinhweb.Convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.laptrinhweb.DTO.BrandDTO;
import com.laptrinhweb.Entity.BrandEntity;
import com.laptrinhweb.repository.BrandRepository;

@Component
public class Brand {
	@Autowired 
	BrandRepository brandRepository;
	
	public BrandEntity toEntity(BrandDTO brandDTO) {
		return brandRepository.findById(brandDTO.getId()).get();
	}
	public BrandDTO toDTO(BrandEntity brandEntity) {
		BrandDTO brandDTO = new BrandDTO();
		brandDTO.setId(brandEntity.getId());
		brandDTO.setName(brandEntity.getName());
		return brandDTO;
	}
}
