package com.example.todosApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todosApp.models.Users;
import com.example.todosApp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	public Users getUserById(Long id) {
		return userRepo.getUserById(id);
	}
	public Users getUserByName(String name) {
		return userRepo.getUsersByName(name);
	}
	
	public void addUsers(Users user) {
		userRepo.addUsers(user);
	}
}
