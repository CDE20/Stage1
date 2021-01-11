package com.spring.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MemberShip membership = (MemberShip) context.getBean("membership");

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

		System.out.println("Enter MemberShip Details:");
		System.out.print("Membership Id: ");
		int membershipId = Integer.parseInt(sc.nextLine());

		System.out.print("Membership Type: ");
		String membershipType = sc.nextLine();

		System.out.print("Visits per Year: ");
		int visitsPerYear = Integer.parseInt(sc.nextLine());

		Customer customer = new Customer();
		customer.setCustId(custId);
		customer.setCustName(custName);
		customer.setEmailId(emailId);
		customer.setContactNo(contactNo);

		membership.setMembershipId(membershipId);
		membership.setMembershipType(membershipType);
		membership.setVisitsPerYear(visitsPerYear);

		System.out.println(membership);

	}

}
