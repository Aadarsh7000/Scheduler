package com.yash.scheduler.services;

import javax.servlet.http.HttpServletRequest;

import com.mysql.cj.Session;
import com.yash.scheduler.beans.User;
import com.yash.scheduler.daoimpl.UserImpl;

public interface AuthServices {
	
	public boolean isAuth(HttpServletRequest req);

	public boolean login(User user);

	public void signup(User user);

	public void logout(HttpServletRequest request);

}
