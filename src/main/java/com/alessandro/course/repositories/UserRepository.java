package com.alessandro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandro.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
