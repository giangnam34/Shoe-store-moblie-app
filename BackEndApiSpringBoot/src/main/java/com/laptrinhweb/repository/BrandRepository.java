package com.laptrinhweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptrinhweb.Entity.BrandEntity;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Long>{

}

