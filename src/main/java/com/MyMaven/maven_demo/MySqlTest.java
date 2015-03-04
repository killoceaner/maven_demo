package com.MyMaven.maven_demo;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class MySqlTest {
	public static void main(String[] args) {
		Connection conn = null ;
		String sql = "" ;
//		String URL = "jdbc:mysql://localhost:3306/test";
//		String root = "root";
//		String password = "root";
		 String url = "jdbc:mysql://localhost:3306/test_db?"
	                + "user=root&password=root&useUnicode=true&characterEncoding=UTF8";
		try {
			Class.forName("com.mysql.jdbc.Driver");			
			conn = (Connection) DriverManager.getConnection(url);
			Statement stmt = (Statement) conn.createStatement();
			sql = "create table student(NO char(20),name varchar(20),primary key(NO))";
			int result = stmt.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("驱动包没找到");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("数据库连接失败");
			e.printStackTrace();
		}
	}
}
