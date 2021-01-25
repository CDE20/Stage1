package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
		CurrencyConverter cc = (CurrencyConverter) context.getBean("currencyConv");
		System.out.println(cc.getTotalCurrencyValue("10Dollar"));
	}

}
