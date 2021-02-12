package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
	
		Customer bean = (Customer) context.getBean("custObj");
		System.out.println(bean.getCustId());
		
		MemberShip memberShip = (MemberShip) context.getBean("memberShip");
		System.out.println(memberShip.getCustomer());
	}

}
