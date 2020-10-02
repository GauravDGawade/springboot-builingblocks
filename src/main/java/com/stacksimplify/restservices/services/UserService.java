package com.stacksimplify.restservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stacksimplify.restservices.entities.User1;
import com.stacksimplify.restservices.repositories.UserRepository;

@Service
public class UserService {
	
	//Autowire user repository
	
	@Autowired
	private UserRepository userRepository;
	
	//getAllUsers Method
	public List<User1> getAllUsers(){
		return userRepository.findAll();
	}
	
	//Create User method
	public User1 createUser(User1 user) {
		return userRepository.save(user);
	}
	
	//get user by id
	public Optional<User1> getUserById(Long id) {
		Optional<User1> user = userRepository.findById(id);
		return user;
	}
	
	
	//update user by Id
	public User1 updateUserById(Long id, User1 user) {
		user.setId(id);
		return userRepository.save(user);
	}
	
	//Delete user by Id
	public void deleteUserById(Long id) {
		if(userRepository.findById(id).isPresent()) {
			userRepository.deleteById(id);
		}
	}
	
	//getUserByUserName
	public User1 getUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
	
	
	
	
	
}
