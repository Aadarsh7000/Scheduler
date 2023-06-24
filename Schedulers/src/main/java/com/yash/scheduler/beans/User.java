package com.yash.scheduler.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
	private long userId;
	private String userEmail;
	private String userPassword;
	private String userName;
	private List<Tasks> assignedTask= new ArrayList<>();
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long userId, String userEmail, String userPassword, String userName, List<Tasks> assignedTask) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userName = userName;
		this.assignedTask = assignedTask;
	}
	public List<Tasks> getAssignedTask() {
		return assignedTask;
	}
	public void setAssignedTask(List<Tasks> assignedTask) {
		this.assignedTask = assignedTask;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	public long getUserId() {
		return userId;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(userEmail, userId, userName, userPassword);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(userEmail, other.userEmail) && userId == other.userId
				&& Objects.equals(userName, other.userName) && Objects.equals(userPassword, other.userPassword);
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userEmail=" + userEmail + ", userPassword=" + userPassword + ", userName="
				+ userName + "]";
	}

	
	
	
	
	
	

}
