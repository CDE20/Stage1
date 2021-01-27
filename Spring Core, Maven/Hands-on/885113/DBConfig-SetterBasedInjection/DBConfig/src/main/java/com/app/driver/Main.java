package com.app.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.EmployeeDAO;

public class Main {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
 ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
 EmployeeDAO obj=(EmployeeDAO) context.getBean("emp");
 obj.getDbConfig().setDriverName("oracle.jdbc.driver.OracleDriver");
 
	System.out.println(obj.getDbConfig().getDriverName());
	
		System.out.println(obj.getDbConfig().getUrl());
		System.out.println(obj.getDbConfig().getUserName());
		System.out.println(obj.getDbConfig().getPassword());
	}
}