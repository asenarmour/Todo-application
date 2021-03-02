package com.example.todosApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todosApp.models.Todo;
import com.example.todosApp.repository.TodoRepository;

@Service
public class TodoService {

	@Autowired
	TodoRepository todoRepo;
	
	public List<Todo> getTodos(Long id) {
		return todoRepo.getTodo(id);
	}
	
	public void putTodo(Todo todo) {
		todoRepo.putTodo(todo);
	}
}
