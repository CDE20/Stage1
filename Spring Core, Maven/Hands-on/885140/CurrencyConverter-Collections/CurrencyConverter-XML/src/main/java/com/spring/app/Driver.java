package com.spring.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
public static void main(String[] args)
{

	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
	CurrencyConverter CC = (CurrencyConverter) ctx.getBean("currency");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value");
	String value = sc.next();
	int currencyValue = CC.getTotalCurrencyValue(value);
	System.out.println(currencyValue);
}

}
