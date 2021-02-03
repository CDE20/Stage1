package com.cognizant.truyum.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionHandler {

	private static Connection con = null;
	private static Properties props = new Properties();
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
			try{
			
			FileInputStream fis = null;
			fis = new FileInputStream("connection.properties");
			props.load(fis);

			Class.forName(props.getProperty("driver"));

            con = DriverManager.getConnection(props.getProperty("connection-url"),props.getProperty("user"),props.getProperty("password"));
	    }
	    catch(IOException e){
	        e.printStackTrace();
	    }
		return con;	
		
	}
}
