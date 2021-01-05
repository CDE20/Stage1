package com.spring.app;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

	    ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		CurrencyConverter c = (CurrencyConverter) ctx.getBean("currencyConverter");
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    System.out.println(c.getTotalCurrencyValue(str));
	}

}
