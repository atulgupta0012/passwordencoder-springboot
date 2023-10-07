package com.springboot.restapi.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springboot.restapi.entity.User;
import com.springboot.restapi.repository.UserRepository;

@Service

public class UserService {
	
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	
	
	public  UserService(UserRepository userRepository, PasswordEncoder passwordEncoder)
	{
		this.userRepository=userRepository;
		this.passwordEncoder=passwordEncoder;
	}
	
	// for setting the user name and password
	
	public User createUser(String username, String password)
	{
		String encodedPassword=passwordEncoder.encode(password);
		User user=new User();
		user.setUsername(username);
		user.setPassword(encodedPassword);
		
		return userRepository.save(user);
		
	}

}
