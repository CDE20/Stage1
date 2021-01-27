package com.spring.app;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String str;
    str=sc.next();
    ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    CurrencyConverter obj=(CurrencyConverter) context.getBean("currency");
   int value=obj.getTotalCurrencyValue(str);
System.err.println("Result is "+value);

	
}

}
