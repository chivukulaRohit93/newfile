package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.login;
import com.example.demo.repo.loginRepository;

@RestController
public class loginController {
	
	@Autowired
	loginRepository loginRepo;
	
	@GetMapping("/login")
	public List<login> getLogin() {
		return this.loginRepo.findAll();
	}
	
	@PostMapping("/login")
	public login addlogin(@RequestBody login register) {
		System.out.println("register "+register.toString());
		return loginRepo.save(register);
	}


}
