package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
public static void main(String[] args)
{
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	MemberShip memberShip = (MemberShip) ctx.getBean("memberShip");
	System.out.println(memberShip);
}

}
