package com.yash.scheduler.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;
import com.yash.scheduler.beans.Tasks;
import com.yash.scheduler.beans.User;
import com.yash.scheduler.util.DBConnection;
import com.yash.sheduler.dao.TaskDao;

public class Taskimpl implements TaskDao {
	private static final String SQL_ADD_TASK = "insert into assined_task(task_title,description,start_date,end_date,start_time,end_time,status,priority,userEmail) values(?,?,?,?,?,?,?,?,?)";
	
	Connection connection=null;
	PreparedStatement preparedStatement= null;
	User user;
	String userEmail;
	HttpServletRequest request;
	
	

	
	@Override
	public boolean find(Tasks task) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int save(Tasks task , String userEmail) {
		int result=0;
		

	
		
		try {
			
			connection=DBConnection.openConnection();
			preparedStatement=connection.prepareStatement(SQL_ADD_TASK);
			preparedStatement.setString(1,task.getTask_title());
			preparedStatement.setString(2,task.getDescripton());
			preparedStatement.setString(3,task.getStart_date());
			preparedStatement.setString(4,task.getEnd_date());
			preparedStatement.setString(5,task.getStart_time());
			preparedStatement.setString(6,task.getEnd_time());
			preparedStatement.setString(7,task.getStatus());
			preparedStatement.setString(8,task.getPriority());
			preparedStatement.setString(9,userEmail);
			
		    result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return result;


	}

	@Override
	public void delete(int id) {
	connection=DBConnection.openConnection();
	

	}

	@Override
	public void update(Tasks task) {
		// TODO Auto-generated method stub

	}

}
