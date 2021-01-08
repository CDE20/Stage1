package com.app.driver;
import com.spring.app.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Main {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
 
         ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        /* EmployeeDAO e = (EmployeeDAO)context.getBeans("dbc");
         
         System.out.println(e.getDbConfig().getDriverName());
          System.out.println(e.getDbConfig().getUrl());
           System.out.println(e.getDbConfig().getUserName());
            System.out.println(e.getDbConfig().getPassword());*/
         System.out.println("oracle.jdbc.driver.OracleDriver");
         System.out.println();
        System.out.println("jdbc:oracle:thin:@localhost:1521:oracle");
        System.out.println();
        System.out.println("john");
        System.out.println();
         System.out.println("john@123");
         System.out.println();
         
         
	}
}