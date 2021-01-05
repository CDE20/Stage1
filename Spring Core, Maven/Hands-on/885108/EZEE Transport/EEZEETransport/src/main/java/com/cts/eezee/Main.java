package com.cts.eezee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.eezee.model.Booking;

import com.cts.eezee.service.TransportService;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Booking booking = (Booking) context.getBean("booking");
		TransportService transport = (TransportService) context.getBean("transportService");
		transport.registerBooking(booking);
		
	}	

}
