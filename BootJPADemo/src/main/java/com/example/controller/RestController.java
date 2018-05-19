package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.modal.Login;
import com.example.modal.User;
import com.example.services.LoginService;
import com.example.services.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private UserService userService;


	@Autowired
	private LoginService loginService;

	@GetMapping("/save-user")
	public String saveUser(@RequestParam String username, @RequestParam String firstname, @RequestParam String lastname,
			@RequestParam int age, @RequestParam String password) {
		User user = new User(username, firstname, lastname, age, password);
		
		userService.saveMyUser(user);
		return "welcomepage";
	}

	@GetMapping("/login")
	public ModelAndView saveUser(@RequestParam String username, @RequestParam String password) {
		Login login = new Login(username, password);
		loginService.saveMyUser(login);
		ModelAndView log=new ModelAndView();
		log.setViewName("welcomepage");
		log.addObject("login", login);   
		return log;
	}

	
}
