package com.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ApplicationConfig.class);
		context.refresh();
		
		Employee employee = context.getBean(Employee.class);
		
		System.out.println(employee);
	}

}
