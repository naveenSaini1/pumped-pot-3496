package com.tripy.models;


public class LoginUser {

	private String userId;
	private String password;
	private String userType;

	public LoginUser() {
		// TODO Auto-generated constructor stub
	}

	public LoginUser(String userId, String password, String userType) {
		super();
		this.userId = userId;
		this.password = password;
		this.userType = userType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "LoginUser [userId=" + userId + ", password=" + password + ", userType=" + userType + "]";
	}
	
	
	
}
