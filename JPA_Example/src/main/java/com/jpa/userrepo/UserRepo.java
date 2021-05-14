package com.jpa.userrepo;

import org.springframework.data.repository.CrudRepository;

import com.jpa.model.User;

public interface UserRepo extends CrudRepository<User, Integer> {
	
}
