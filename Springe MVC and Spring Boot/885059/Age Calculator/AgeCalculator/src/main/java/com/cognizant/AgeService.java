package com.cognizant;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeService {

	
	public  String calculateAge (String date){
	
    	//add the code as per the requirement
    	//System.out.println(date);
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	LocalDate dob = LocalDate.parse(date, formatter);
    	LocalDate now = LocalDate.now();
    	Period diff = Period.between(dob, now);
    	return "you are "+diff.getYears()+" years, "+diff.getMonths()+" months, "+diff.getDays()+" days old.";
    }
}
