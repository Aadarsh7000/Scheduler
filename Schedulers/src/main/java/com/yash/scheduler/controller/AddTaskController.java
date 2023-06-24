package com.yash.scheduler.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.scheduler.beans.Tasks;
import com.yash.scheduler.daoimpl.Taskimpl;

/**
 * Servlet implementation class AddTaskController
 */
@WebServlet("/addtask")
public class AddTaskController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTaskController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String task_title=request.getParameter("task_title");
		String description=request.getParameter("description");
		String start_date=request.getParameter("start_date");
		String end_date=request.getParameter("end_date");
		String start_time=request.getParameter("start_time");
		String end_time=request.getParameter("end_time");
		String status=request.getParameter("status");
		String priority=request.getParameter("priority");
		
		Tasks task= new Tasks();
		task.setTask_title(task_title);
		task.setDescripton(description);
		task.setStart_date(start_date);
		task.setEnd_date(end_date);
		task.setStart_time(start_time);
		task.setEnd_time(end_time);
		task.setStatus(status);
		task.setPriority(priority);
		
		Taskimpl addtask= new Taskimpl();
		try {
			 Cookie cookie[]=request.getCookies();  
			  String userEmail=(String)cookie[0].getValue(); 
			  	System.out.println("userEmail"+userEmail);
            addtask.save(task,userEmail);
            System.out.print("Successfully add the task");
            response.sendRedirect("Table.jsp");
        } catch (Exception e) {
           
            e.printStackTrace();
        }
		
		
	}

}
