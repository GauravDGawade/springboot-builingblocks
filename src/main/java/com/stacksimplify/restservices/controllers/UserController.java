package com.stacksimplify.restservices.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stacksimplify.restservices.entities.User1;
import com.stacksimplify.restservices.services.UserService;

//Controller
@RestController
public class UserController {
	//AutoWire the UserService
	@Autowired
	private UserService userService;
	
	//getAllUsers Method
	
	@GetMapping("/users")
	public List<User1> getAllUsers(){
		return userService.getAllUsers();
	}
	
	//Create User
	//@RequestBody Annotatio
	//@PostMapping Annotation
	
	@PostMapping("/users")
	public User1 createUser(@RequestBody User1 user) {
		return userService.createUser(user);
	}
	
	//Get user by Id
	@GetMapping("/users/{id}")
	public Optional<User1> getUserById(@PathVariable("id") Long id){
		return userService.getUserById(id);
	}
	
	//Update user by Id
	@PutMapping("/users/{id}")
	public User1 updateUserById(@PathVariable("id") Long id, @RequestBody User1 user) {
		return userService.updateUserById(id, user);
	}
	
	//Delete user by Id
	@DeleteMapping("/users/{id}")
	public void deleteUserById(@PathVariable("id") Long id) {
		userService.deleteUserById(id);
	}
	
	//Get User by username
	@GetMapping("/users/byusername/{username}")
	public User1 getUserByUsername(@PathVariable("username") String username) {
		return userService.getUserByUsername(username);
	}
}
