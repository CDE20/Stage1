package com.cognizant.truyum.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionHandler {

	public static Connection getConnection() throws IOException, SQLException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\NAKOOL\\eclipse-workspace\\truYum\\src\\connection.properties");
		Properties props = new Properties();
		props.load(fis);

		Connection conn = DriverManager.getConnection(props.getProperty("db_url"), props.getProperty("db_user"),
				props.getProperty("db_pass"));
		//System.out.println("Connection Successful");
		return conn;
	}
}