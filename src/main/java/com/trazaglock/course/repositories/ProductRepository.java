package com.trazaglock.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trazaglock.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
