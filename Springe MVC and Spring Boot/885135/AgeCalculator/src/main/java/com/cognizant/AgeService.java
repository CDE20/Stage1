package com.cognizant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class AgeService {

	
	public  String calculateAge (String date){
		LocalDate birthdate = LocalDate.parse(date);
		LocalDate now=LocalDate.now();
		return "you are "+Period.between(birthdate, now).getYears()+" years, "+Period.between(birthdate, now).getMonths()+" months, " +Period.between(birthdate, now).getDays()+" days old.";
		
}
}
