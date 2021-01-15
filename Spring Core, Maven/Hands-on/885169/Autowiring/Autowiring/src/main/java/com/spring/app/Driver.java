package com.spring.app;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Driver {
public static void main(String[] args)
{
   	ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
   	
   	     
   	     
   	     //Employee employee =  ctx.getBean("employee", Employee.class);
   	      Employee employee =  ctx.getBean(Employee.class);
   	      employee.setEmpId(123);
	    employee.setEmpName("vaishnavi");
   	     
   	     
   	     
   	     System.out.println("EmpID : " +employee.getEmpId());
   	     System.out.println("EmpName : " +employee.getEmpName());
   	     ctx.close();
}
}
	

