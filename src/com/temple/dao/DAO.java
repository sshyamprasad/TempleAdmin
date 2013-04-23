package com.temple.dao;

import java.sql.*;

public class DAO {
	

	public static Connection getConnection() {
		Connection conn = null;
		System.out.println("MySQL Connect Example.");
		conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "temple";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "jaga";
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager
					.getConnection(url + dbName, userName, password);
			System.out.println("Connected to the database");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public void closeConnection(Connection connection) {
		try {
			if(null!=connection) {
				connection.close();
				System.out.println("Connection closed successfully");
			} else {
				System.out.println("Connection not existed to close");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	DAO dao = new DAO();
	Connection con = dao.getConnection();
	if(null!=con) {
		System.out.println("Connection success");
	} else {
		System.out.println("Connection not success");
	}
	dao.closeConnection(con);
}
}
