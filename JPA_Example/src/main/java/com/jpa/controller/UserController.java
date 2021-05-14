package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.model.User;
import com.jpa.serviceimpl.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl ;
	
	@GetMapping("/getusers")
	public List<User> getAllUser()
	{
		return userServiceImpl.getAllUser();
	}
	
	@GetMapping("/getusers/{uid}")
	public User getUserById(@PathVariable int uid)
	{
		User user=userServiceImpl.getUserById(uid);
		return user;
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) 
	{
		return userServiceImpl.addUser(user);
	}
	 
	@PutMapping("/updateuser")
	public List<User> updateUser(@RequestBody User user)
	{
		userServiceImpl.updateUserById(user);
		return userServiceImpl.getAllUser();
	}
	
	@DeleteMapping("/deleteuser/{uid}")
	public List<User> deleteUser(@PathVariable int uid)
	{
		userServiceImpl.deleteUserById(uid);
		return userServiceImpl.getAllUser();
	}
}
