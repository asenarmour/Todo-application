package com.example.todosApp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.todosApp.models.Todo;

@Repository
public class TodoRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	public List<Todo> getTodo(Long id) {
		List<Todo> todos=(List<Todo>)entityManager.createQuery("select c from Todo c where c.user_id=:id").setParameter("id", id).getResultList();
		return todos;
	}
	
	@Transactional
	public void putTodo(Todo todo) {
		entityManager.persist(todo);
		entityManager.flush();
		entityManager.detach(todo);
	}
}
