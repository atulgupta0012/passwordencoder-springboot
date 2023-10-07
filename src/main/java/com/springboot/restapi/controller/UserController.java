package com.springboot.restapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restapi.entity.User;
import com.springboot.restapi.service.UserService;


@RestController
@RequestMapping("/api/users")
public class UserController {
	
	
	private final UserService userService;

	public UserController(UserService  userService)
	{
		this.userService=userService;
	}
	
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User  user)
	{
		return userService.createUser(user.getUsername(), user.getPassword());
	}
}
