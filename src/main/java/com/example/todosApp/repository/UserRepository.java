package com.example.todosApp.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.todosApp.models.Users;

@Repository
public class UserRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public void addUsers(Users user) {
		entityManager.persist(user);
		entityManager.flush();
		entityManager.detach(user);
	}
	
	public Users getUserById(Long id) {
		Users user=entityManager.find(Users.class, id);
		return user;
	}
	
	public Users getUsersByName(String name) {
		Users user=(Users)entityManager.createQuery("select c from Users c where c.name=:name").setParameter("name",name).getSingleResult();
		return user;
	}
}
