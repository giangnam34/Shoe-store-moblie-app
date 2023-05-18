package com.laptrinhweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhweb.Entity.ProductOrderEntity;
import com.laptrinhweb.Key.ProductOrderKey;



public interface ProductOrderRepository extends JpaRepository<ProductOrderEntity, ProductOrderKey> {

}
