package com.yash.scheduler.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.yash.scheduler.beans.User;
import com.yash.scheduler.util.DBConnection;
import com.yash.sheduler.dao.UserDao;

public class UserImpl implements UserDao {
	
	private String SQL_LOGIN="select * from user where userEmail=? and userPassword=?";
	private String SQL_REGISTER="insert into user(userName,userEmail,userPassword) values(?,?,?)";
	private String SQL_DELETE="delete from user where userId=?";
	private String SQL_UPDATE="update  user  set userName=?,userEmail=?,userPassword=? where userId=?";
	
    Connection connection= null;
    Statement statement = null;
    ResultSet resultset = null;
    PreparedStatement preparedStatement= null;
    
    

	@Override
	public int save(User user) {
		int result=0;
		
		
		try {
			connection=DBConnection.openConnection();
			preparedStatement=connection.prepareStatement(SQL_REGISTER);
			preparedStatement.setString(1,user.getUserName());
			preparedStatement.setString(2,user.getUserEmail());
			preparedStatement.setString(3,user.getUserPassword());
			result=preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
		
		
		
		
		
	}

	@Override
	public int update(User user) {
		int result =0;
		try {
			connection=DBConnection.openConnection();
			preparedStatement=connection.prepareStatement(SQL_UPDATE);
			preparedStatement.setString(1,user.getUserName());
			preparedStatement.setString(2,user.getUserEmail());
			preparedStatement.setString(3,user.getUserPassword());
			preparedStatement.setLong(4,user.getUserId());
			result=preparedStatement.executeUpdate();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
		
	}

	@Override
	public int delete(Long id) {
		int result=0;
		
		try {
			connection=DBConnection.openConnection();
			preparedStatement=connection.prepareStatement(SQL_DELETE);
			preparedStatement.setLong(1,id);
			result=preparedStatement.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean find(User user) {
		boolean status=false;
		System.out.print(user.getUserEmail());
		System.out.print(user.getUserPassword());
		
		try {
			
			connection=DBConnection.openConnection();
			preparedStatement=connection.prepareStatement(SQL_LOGIN);
			preparedStatement.setString(1,user.getUserEmail());
			preparedStatement.setString(2,user.getUserPassword());
			
			resultset=preparedStatement.executeQuery();
			status=resultset.next();
//			System.out.print(status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.print(status);
		return status;
		
		
	}

}
