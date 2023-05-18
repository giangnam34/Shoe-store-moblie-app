package com.laptrinhweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhweb.Entity.ImageEntity;


public interface ImageRepository extends JpaRepository<ImageEntity, Long> {

}
