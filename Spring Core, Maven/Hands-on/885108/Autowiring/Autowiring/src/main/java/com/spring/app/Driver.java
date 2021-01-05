package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
public static void main(String[] args)
{
	ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	Employee emp = context.getBean(Employee.class);
	System.out.println(emp.getEmpId()+"\n"+emp.getEmpName()+"\n"+emp.getPassObj().getPassNum()+"\n"+emp.getPassObj().getDateOfExpiry()+"\n"+emp.getPassObj().getDateOfIssue());
}
	
}
