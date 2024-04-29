package com.rto.example.RtoManagement;

import java.sql.*;

public class DBConnection {
private static final String url="jdbc:mysql://localhost:3306/Example";
private static final String username="root";
private static final String password="root";
public static Connection getConnection() throws SQLException  {
	return DriverManager.getConnection(url,username,password);
	
}
}
