package com.jdbcconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcConnection {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		System.out.println("main method started");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class has been loaded successfully! ");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sudha","root","root");
		Statement stmt=con.createStatement();
		String sql="select*from student";
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println("****************");
		}
		
		
	}

}
