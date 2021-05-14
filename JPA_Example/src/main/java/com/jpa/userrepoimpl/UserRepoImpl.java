package com.jpa.userrepoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.model.User;
import com.jpa.userrepo.UserRepo;

@Component
public class UserRepoImpl {
	
	@Autowired
	UserRepo userRepo;
	
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> userlist = (List<User>)userRepo.findAll();
		return userlist;
	}
	
	public User getUserById(int uid)
	{
		Optional<User> user=userRepo.findById(uid);
		
			if(user.isPresent())		
				return user.get();
			else
			{
				return null;
			}
		
	}
	
	public void updateUser(User user)
	{
		Boolean b =userRepo.existsById(user.getUserId());
		if(b)
		userRepo.save(user);
	}
	
	public void deleteUser(int uid)
	{
		Boolean b =userRepo.existsById(uid);
		if(b)
			userRepo.deleteById(uid);
	}
   
	public User addUser(User user)
	{
		User user2=userRepo.save(user);
		return user2;
	}
	

}
