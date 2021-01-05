package com.cts.eezee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.eezee.model.Booking;

import com.cts.eezee.service.TransportService;

public class Main {

	public static void main(String[] args) throws ParseException{
		
	
	
		// code here
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Booking booking = (Booking) ctx.getBean("booking");
		TransportService transport = (TransportService) ctx.getBean("transport");
		transport.registerBooking(booking);
		
	}	

}
