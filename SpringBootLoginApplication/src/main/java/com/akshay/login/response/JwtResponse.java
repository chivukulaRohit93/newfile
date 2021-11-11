package com.akshay.login.response;

import java.util.List;

import lombok.Data;

@Data
public class JwtResponse {
	
	private String token;
	private Long id;
	private String type;
	private String username;
	private String email;
	private List<String> roles;
	
	public JwtResponse(String token, Long id, String username, String email, List<String> roles) {
		super();
		this.token = token;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}
}
