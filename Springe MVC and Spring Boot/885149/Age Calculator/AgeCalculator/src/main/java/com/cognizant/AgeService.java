package com.cognizant;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class AgeService {
	
// 	public static void main(String[] args) {
// 		AgeService as = new AgeService();
// 		as.calculateAge("1998-09-11");
// // 	}
	
	public  String calculateAge (String date){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate d = LocalDate.parse(date,formatter);
		LocalDate todayDate = LocalDate.now();
		Period years = Period.between(d,todayDate);
//		System.out.println(years.getMonths());
		String result = "you are "+years.getYears()+" years, "+years.getMonths()+" months, "+years.getDays()+" days old.";
//		System.out.println(result);
		return result;
}
}
