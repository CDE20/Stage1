package com.cognizant;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeService {

	
	public  String calculateAge (String date){
	
	//add the code as per the requirement
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");    
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.parse(date, formatter);


		Period p = Period.between(birthday, today);
		String result = "you are " + p.getYears() + " years, " + p.getMonths() +
		                   " months, " + p.getDays() +
		                   " days old.";
		return result;
}
}
