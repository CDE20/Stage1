package com.app.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.DBConfig;
import com.spring.app.EmployeeDAO;

public class Main {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
 
 
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDAO emp = (EmployeeDAO) ctx.getBean("emp");
		DBConfig config = emp.getDbConfig();
		System.out.println(config.getDriverName());
		System.out.println(config.getUrl());
		System.out.println(config.getUserName());
		System.out.println(config.getPassword());
		
		
	}
}