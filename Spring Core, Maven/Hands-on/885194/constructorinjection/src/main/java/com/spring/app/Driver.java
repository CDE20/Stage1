package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {
	    
	    Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Customer Details:");
        
        System.out.print("Customer Id: ");
        int custId = Integer.parseInt(sc.nextLine());
        
        System.out.print("Name: ");
        String custName = sc.nextLine();
        
        System.out.print("Email Id: ");
        String emailId = sc.nextLine();
        
        System.out.print("Contact No: ");
        long contactNo = Long.parseLong(sc.nextLine());
        
        System.out.println("Enter Customer Details:");
        System.out.print("Membership Id: ");
        int membershipId = Integer.parseInt(sc.nextLine());
        
        System.out.print("Membership Type: ");
        String membershipType = sc.nextLine();
        
        System.out.print("Visits per Year: ");
        int visitsPerYear = Integer.parseInt(sc.nextLine());
        
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Customer customer = new Customer();
        customer.setCustId(custId);
        customer.setCustName(custName);
        customer.setEmailId(emailId);
        customer.setContactNo(contactNo);
        
        
		MemberShip membership = (MemberShip) context.getBean("member");
        membership.setMembershipId(membershipId);
        membership.setMembershipType(membershipType);
        membership.setVisitsPerYear(visitsPerYear);
        
		System.out.println(membership);
	}
}
