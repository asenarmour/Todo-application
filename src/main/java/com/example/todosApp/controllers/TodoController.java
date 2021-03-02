package com.example.todosApp.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todosApp.models.Todo;
import com.example.todosApp.services.TodoService;

@RestController
@RequestMapping("/api/v1")
public class TodoController {

	@Autowired
	TodoService todoService;
	
	@PostMapping("/todo")
	public void putTodo(@RequestBody Todo todo) {
		todoService.putTodo(todo);
	}
	
	@GetMapping("/todo/{id}")
	public Collection<Todo> getTodo(@PathVariable Long id){
		return todoService.getTodos(id);
	}
}
