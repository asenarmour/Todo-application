package com.example.todosApp.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todo")
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long todo_id;
	
	private Long user_id;
	private String todo_name;
	private Timestamp deadline;
	public Long getTodo_id() {
		return todo_id;
	}
	public void setTodo_id(Long todo_id) {
		this.todo_id = todo_id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getTodo_name() {
		return todo_name;
	}
	public void setTodo_name(String todo_name) {
		this.todo_name = todo_name;
	}
	public Timestamp getDeadline() {
		return deadline;
	}
	public void setDeadline(Timestamp deadline) {
		this.deadline = deadline;
	}
	public Todo(Long todo_id, Long user_id, String todo_name, Timestamp deadline) {
		super();
		this.todo_id = todo_id;
		this.user_id = user_id;
		this.todo_name = todo_name;
		this.deadline = deadline;
	}
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
