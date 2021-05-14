package com.jpa.service;

import java.util.List;

import com.jpa.model.User;

public interface UserService {
	
	public List<User> getAllUser();
	public User getUserById(int uid);
	public void updateUserById(User user);
	public void deleteUserById(int uid);
	public User addUser(User user);
}
