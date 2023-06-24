package com.yash.scheduler.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
  private final static String URL="jdbc:mysql://localhost:3306/scheduler";	
  private final static String DRIVER="com.mysql.cj.jdbc.Driver";
  private final static String USERNAME="root";
  private final static String PASSWORD="P@ssw0rd@2023";
 
  private static Connection connection=null;
  
  public static Connection openConnection() {
	  if(connection != null ) {
		  return connection;
	  }else {
		  
		  try {
			  Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return connection;
	  }
	
  }
  
}
