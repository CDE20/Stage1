package com.cognizant.truyum.dao;

import java.sql.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConnectionHandler {
	public static Connection getConnection() throws FileNotFoundException, IOException, SQLException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\Users\\885149\\eclipse-workspace\\truYum\\src\\connection.properties"));
		String url = prop.getProperty("connection-url");
		String user = prop.getProperty("user");
		String password = prop.getProperty("password");
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
}
