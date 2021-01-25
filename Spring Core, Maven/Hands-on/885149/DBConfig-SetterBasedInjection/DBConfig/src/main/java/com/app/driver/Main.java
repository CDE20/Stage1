package com.app.driver;
import com.spring.app.DBConfig;
import com.spring.app.EmployeeDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	   ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        EmployeeDAO dao = (EmployeeDAO) context.getBean("employeedao");
 	System.out.println(dao.getDbUrl());
	}
	
}