package com.capgemini.model;

public class AccountRequest {
	private String username;
	private String password;
	public AccountRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
