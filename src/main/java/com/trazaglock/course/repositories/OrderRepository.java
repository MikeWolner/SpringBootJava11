package com.trazaglock.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trazaglock.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
