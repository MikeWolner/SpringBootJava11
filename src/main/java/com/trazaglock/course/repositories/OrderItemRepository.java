package com.trazaglock.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trazaglock.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
