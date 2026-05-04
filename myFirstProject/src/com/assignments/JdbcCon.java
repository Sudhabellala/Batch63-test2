package com.assignments;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCon {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("main method started");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sudha", "root", "root");
		Statement stmt = con.createStatement();
		String sql = "insert into studentdata values(1,'vedha','2021-06-10','MCA','vedha@gmail.com',6301680692)";
		int rows = stmt.executeUpdate(sql);
		
		System.out.println("Rows: "+rows);
		//rs.close();
		stmt.close();
		con.close();
		System.out.println("main method ended.");
	}

}
