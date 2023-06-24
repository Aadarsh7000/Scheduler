package com.yash.scheduler.serviceimpl;

import javax.servlet.http.HttpServletRequest;

import com.yash.scheduler.beans.User;
import com.yash.scheduler.daoimpl.UserImpl;
import com.yash.scheduler.services.AuthServices;

public class AuthServicesImpl implements AuthServices {
	public final static String USER_ATTRIBUTE = "user";

	private final UserImpl userdao = new UserImpl();

	public boolean isAuth(HttpServletRequest req) {
		return req.getSession().getAttribute(USER_ATTRIBUTE) != null;
	}

	public boolean login(User user) {
		
		if (userdao.find(user) == true) {
			return true;
		} else {
			return false;
		}
	}

	public void signup(User user) {
		userdao.save(user);
	}

	public void logout(HttpServletRequest request) {
		request.getSession().removeAttribute(USER_ATTRIBUTE);
	}

}
