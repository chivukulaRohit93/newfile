package com.akshay.login.request;

import java.util.Set;

import lombok.Data;

@Data
public class SignupRequest {
	
	private String username;
	private String email;
	private String password;
	private Set<String> role;
}
