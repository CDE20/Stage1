package com.cognizant.truyum.dao;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionHandler {

	public static Connection getConection() {
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File("../../../connection.properties"));
			Properties props = new Properties();
			props.load(fis);
			// load the Driver Class
			Class.forName(props.getProperty("driver"));

			// create the connection now
			return DriverManager.getConnection(props.getProperty("connection-url"), props.getProperty("user"),
					props.getProperty("password"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
