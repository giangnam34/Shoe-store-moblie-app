package com.laptrinhweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhweb.Entity.ProductSizeEntity;
import com.laptrinhweb.Key.ProductSizeKey;



public interface ProductSizeRepository extends JpaRepository<ProductSizeEntity, ProductSizeKey> {

}