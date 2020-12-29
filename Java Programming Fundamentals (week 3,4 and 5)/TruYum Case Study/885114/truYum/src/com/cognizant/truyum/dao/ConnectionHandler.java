package com.cognizant.truyum.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionHandler {
	public static Connection getConnection() {

		FileInputStream fis = null;
		Connection connection = null;

		try {
			fis = new FileInputStream("src/connection.properties");
			Properties properties = new Properties();
			properties.load(fis);

			String driver = properties.getProperty("driver");
			String connectionUrl = properties.getProperty("connection-url");
			String user = properties.getProperty("user");
			String password = properties.getProperty("password");

			Class.forName(driver);
			connection = DriverManager.getConnection(connectionUrl, user, password);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}

}