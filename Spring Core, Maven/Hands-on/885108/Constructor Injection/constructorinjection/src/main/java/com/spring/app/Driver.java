package com.spring.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	MemberShip memberShip = (MemberShip) context.getBean("memberShip");
	/*System.out.println("Customer Id:");
	memberShip.getCustomer().setCustId(sc.nextInt());
	System.out.println("Customer Name:");
	memberShip.getCustomer().setCustName(sc.next());
	System.out.println("Email Id:");
	memberShip.getCustomer().setEmailId(sc.next());
	System.out.println("Contact No:");
	memberShip.getCustomer().setContactNo(sc.nextLong());*/
	System.out.println(memberShip);
}

}
