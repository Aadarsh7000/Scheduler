package com.yash.scheduler.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.scheduler.beans.User;
import com.yash.scheduler.daoimpl.UserImpl;
import com.yash.scheduler.serviceimpl.AuthServicesImpl;
import com.yash.scheduler.services.AuthServices;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userEmail = request.getParameter("userEmail");
		String userPassword = request.getParameter("userPassword");

		User user = new User();
		user.setUserEmail(userEmail);
		user.setUserPassword(userPassword);

//		AuthServices service = new AuthServicesImpl();
//		if (service.login(user)) {
//			response.sendRedirect("Dashboard.jsp");
//		} else {
//			response.sendRedirect("index.jsp");
//		}
		
			AuthServices service = new AuthServicesImpl();
			String  destPage="index.jsp";
			System.out.println("user Value"+user);
			
			if(service.login(user)) {
				HttpSession session=request.getSession();
				session.setAttribute("user", user);
				String email=(String) session.getAttribute("userEmail");
				session.setAttribute(userEmail, email);
				Cookie cookie=new Cookie("userEmail",email);//creating cookie object  
				response.addCookie(cookie);
				destPage="Dashboard.jsp";
				
			}else {
				String message="Invalid Email/Password";
				request.setAttribute("message", message);
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
            dispatcher.forward(request, response);
		} 
	}


