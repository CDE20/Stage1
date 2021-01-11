package com.spring.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
public static void main(String[] args)
{
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	CurrencyConverter currencyConverter = (CurrencyConverter)context.getBean("currencyConverter");
	
	System.out.println(currencyConverter);
	
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	int output=currencyConverter.getTotalCurrencyValue(input);
	System.out.println(output);

	
}

}
