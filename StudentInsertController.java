package com.jspider.jdbc_simple_crud_operation.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInsertController {
	public static void main(String[] args) {
		Connection connection=null;
		try {
			//Step-1 load/Resister Drive
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 Create connection
			String url ="jdbc:mysql://localhost:3306/jffsrd-m3";
			String user ="root";
			String pass	="tiger";
			
			connection = DriverManager.getConnection(url,user,pass);
			//Step-3 create Statement
			Statement statement=connection.createStatement();
			
			//step-4 executeQuery
			String insertStudentQuery = "insert into student (id,name,email,phone) values(420,'amit','amit@420',7563926492)";
			statement.execute(insertStudentQuery);
			
			System.out.println("+++++++++Data-------------Stored++++++");
		} catch (ClassNotFoundException | SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//Step-5 close connection
				
				connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
	




