package com.dbms1.demo.controller.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class user {

	@Id
	private String userId;
	private String password;
	
	
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
	@Override
	public String toString() {
		return "user [userId=" + userId + ", password=" + password + "]";
	}
	
	
}
