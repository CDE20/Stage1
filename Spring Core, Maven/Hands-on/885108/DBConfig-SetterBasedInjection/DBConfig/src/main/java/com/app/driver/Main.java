package com.app.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.app.*;
public class Main {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDAO emp = (EmployeeDAO) context.getBean("employeeDao");
		DBConfig db = emp.getDbConfig();
		System.out.println(db.getDriverName());
		System.out.println(db.getUrl());
		System.out.println(db.getUserName());
		System.out.println(db.getPassword());
	}
}