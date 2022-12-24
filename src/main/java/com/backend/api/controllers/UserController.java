package com.backend.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.api.models.User;
import com.backend.api.repositories.UserRepository;
import com.backend.api.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/")
	public List<User> getUsers() {
		return (List<User>) userService.list();
	}
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		User savedUser = userService.create(user);
		return savedUser;
	}
}
