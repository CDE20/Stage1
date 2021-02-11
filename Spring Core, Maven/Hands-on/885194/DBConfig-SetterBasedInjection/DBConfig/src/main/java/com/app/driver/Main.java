package com.app.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.app.DBConfig;
import com.spring.app.EmployeeDAO;
 
public class Main {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeDAO empDao = (EmployeeDAO) context.getBean("employeeDao");
		DBConfig dbconfig = empDao.getDbConfig();
		
		System.out.println(dbconfig.getDriverName());
		System.out.println(dbconfig.getUrl());
		System.out.println(dbconfig.getUserName());
		System.out.println(dbconfig.getPassword());
		
	}
}