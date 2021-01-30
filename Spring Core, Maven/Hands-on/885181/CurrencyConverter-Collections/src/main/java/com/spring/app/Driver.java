package com.spring.app;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Driver {
	
public static void main(String[] args)
{
  
  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CurrencyConverter currencyConverter = (CurrencyConverter) context.getBean("currency");
		
		

	
}

}
