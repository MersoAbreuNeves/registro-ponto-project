package com.project.ibm.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.ibm.repositories.UserRepository;

@Controller
@RequestMapping(value="/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping
	public ResponseEntity<User> create(@RequestBody User user) {
		
		User users = userRepository.save(user);
		
		return ResponseEntity.ok(users);
	}
	
	
	
}
