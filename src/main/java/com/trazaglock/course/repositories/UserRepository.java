package com.trazaglock.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trazaglock.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
