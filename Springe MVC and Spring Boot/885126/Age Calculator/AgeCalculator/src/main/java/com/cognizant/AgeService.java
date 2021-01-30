package com.cognizant;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeService {

	
	public  String calculateAge (String date){
	
	//add the code as per the requirement
	    LocalDate pdate = LocalDate.parse(date);
        LocalDate now = LocalDate.now();
        
        Period diff = Period.between(pdate, now);
   
       String ans="you are "+diff.getYears()+" years, "+diff.getMonths()+" months, "+diff.getDays()+" days old.";
		return ans;
}
}
