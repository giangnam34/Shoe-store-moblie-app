package com.laptrinhweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptrinhweb.Entity.ColorEntity;

public interface ColorRepository extends JpaRepository<ColorEntity, Long>{

}
