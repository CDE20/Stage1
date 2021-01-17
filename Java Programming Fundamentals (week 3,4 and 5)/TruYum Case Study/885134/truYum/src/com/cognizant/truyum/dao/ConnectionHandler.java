package com.cognizant.truyum.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionHandler {
	private static Connection connection;

	/**
	 * Get connection for database
	 * 
	 * @return connection
	 */
	static public Connection getConnection() {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("src/connection.properties"));
			Class.forName(prop.getProperty("driver"));
			connection = DriverManager.getConnection(prop.getProperty("connection-url"), prop.getProperty("user"),
					prop.getProperty("password"));
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void main(String[] args) {
		System.out.println(ConnectionHandler.getConnection());
	}
}