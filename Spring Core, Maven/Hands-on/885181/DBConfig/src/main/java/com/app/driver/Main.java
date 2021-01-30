package com.app.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.app.EmployeeDAO;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDAO e = (EmployeeDAO) apc.getBean("empDao");
		System.out.println(e.getDbConfig().getDriverName()+"\n"+e.getDbConfig().getUrl()+"\n"+e.getDbConfig().getUserName()+"\n"+e.getDbConfig().getPassword());
	}
}