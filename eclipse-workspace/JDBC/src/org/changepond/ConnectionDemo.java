package org.changepond;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) throws SQLException 
	{
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Database@123");
	System.out.println("connection successful");
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//	static void show() {
//	}
//	show();
//	Demo.show();
//	}
//	class DriverManager
//	{
//	static Connection  getConnection("","","") {
//		return con
//	}
//	getConnection();
//	}
//}