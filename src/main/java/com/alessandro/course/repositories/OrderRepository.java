package com.alessandro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandro.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
