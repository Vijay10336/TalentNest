package com.csimplifyit.talentNest.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csimplifyit.talentNest.model.User;
import com.csimplifyit.talentNest.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	public User getUser(Integer id) {
		User user=null;
		try {
			Optional<User>	data=userRepo.findById(id);
			if(data.isPresent())
				user=data.get();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public User getUserbyEmail(String email) {
		User user=null;
		try {
			user=userRepo.findByEmail(email);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	public List<User> getAllUser(){
		List<User> userList=null;
		try {
			userList=userRepo.findAll();
			
		} catch (Exception e) {
			 e.printStackTrace();
		}
		return userList;
	}
	public User updateUser(User user) {
		
		try {
			
			user=userRepo.save(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	public List<User> updateUsers(List<User> users) {
		List<User> userList=null;
		try {
			userList=userRepo.saveAll(users);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}
}
