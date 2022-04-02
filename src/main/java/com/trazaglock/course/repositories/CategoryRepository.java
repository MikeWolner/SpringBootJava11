package com.trazaglock.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trazaglock.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
