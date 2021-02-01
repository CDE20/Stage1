package com.cognizant;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeService {

	
	public  String calculateAge (String date){
	    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD");
		LocalDate dateOfBirth = LocalDate.parse(date);
		LocalDate currentDate = LocalDate.now();
		
		Period P = Period.between(dateOfBirth, currentDate);
		return "you are " + P.getYears() + " years, " + P.getMonths() + " months, " + P.getDays() + " days old.";
}
}
