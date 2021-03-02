package com.example.todosApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todosApp.models.Users;
import com.example.todosApp.services.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/home")
	public String Home() {
		return "welcome home";
	}
	
	@PostMapping("/users")
	public void putUsers(@RequestBody Users user) {
		userService.addUsers(user);
	}
	
	@GetMapping("/users/{id}")
	public Users getUsers(@PathVariable Long id) {
		return userService.getUserById(id);
	}
}
