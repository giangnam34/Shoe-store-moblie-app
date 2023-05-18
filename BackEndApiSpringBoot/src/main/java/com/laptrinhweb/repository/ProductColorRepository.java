package com.laptrinhweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhweb.Entity.ProductColorEntity;
import com.laptrinhweb.Key.ProductColorKey;



public interface ProductColorRepository extends JpaRepository<ProductColorEntity, ProductColorKey>{

}
