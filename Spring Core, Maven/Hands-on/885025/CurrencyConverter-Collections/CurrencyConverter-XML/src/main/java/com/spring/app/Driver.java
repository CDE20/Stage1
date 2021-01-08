package com.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

public class Driver {
	
public static void main(String[] args)
{
    
    ClassPathXmlApplicationContext cont = new ClassPathXmlApplicationContext("beans.xml");
    
    CurrencyConverter cc = (CurrencyConverter)cont.getBean("currencyConverter");
    
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    System.out.println(cc.getTotalCurrencyValue(input));
	
}

}
