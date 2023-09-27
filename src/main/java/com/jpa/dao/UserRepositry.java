package com.jpa.dao;

import java.util.List;

import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jpa.entities.User;

public interface UserRepositry extends CrudRepository<User, Integer> {
	
	public List<User> findByfirstName(String firstName);
	
	
	@Query("select u From User u")
	public List<User> getAllUser();
 
}
