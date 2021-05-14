package com.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Column(name = "username")
	private String userName;
	@Column(name = "usermail")
	private String userMail;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userName, String userMail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMail = userMail;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userMail=" + userMail + ", getUserId()="
				+ getUserId() + ", getUserName()=" + getUserName() + ", getUserMail()=" + getUserMail()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
