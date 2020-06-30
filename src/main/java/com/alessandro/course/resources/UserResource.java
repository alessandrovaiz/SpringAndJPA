package com.alessandro.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alessandro.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	@GetMapping // define função como tipo GET do http
	public ResponseEntity<User> findAll() {
		User u = new User(1L,"Joao","joao@joao.com","123456789","1234");
		return ResponseEntity.ok().body(u);
	}
	
}
