
package com.example.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.modal.Login;
import com.example.repository.LoginRepository;

@Service
@Transactional

public class LoginService{
	
	private final LoginRepository loginRepository;
	
	public LoginService(LoginRepository loginRepository)
	{
		this.loginRepository=loginRepository;
		
	}
	
	
	public void saveMyUser(Login user) {
		loginRepository.save(user);
		
	}
	
}