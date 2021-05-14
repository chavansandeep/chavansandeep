package com.jpa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.model.User;
import com.jpa.service.UserService;
import com.jpa.userrepoimpl.UserRepoImpl;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepoImpl userRepoImpl;
	
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepoImpl.getAllUser();
	}
	
	public User getUserById(int uid)
	{
		System.out.println("servicelayer uid:- "+uid);
		
		return userRepoImpl.getUserById(uid);
	}

	@Override
	public void updateUserById(User user) {
		// TODO Auto-generated method stub
		userRepoImpl.updateUser(user);
	}

	@Override
	public void deleteUserById(int uid) {
		// TODO Auto-generated method stub
		userRepoImpl.deleteUser(uid);
	}

	@Override
	public User addUser(User user) 
	{ // TODO Auto-generated method stub
		  return userRepoImpl.addUser(user);
	}
	 

}
