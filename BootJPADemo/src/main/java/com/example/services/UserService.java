
package com.example.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.modal.User;
import com.example.repository.UserRepository;

@Service
@Transactional

public class UserService{
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository)
	{
		System.out.println("Hi");
		this.userRepository=userRepository;
		
	}
	
	
	public void saveMyUser(User user) {
		userRepository.save(user);
		
	}
	
}