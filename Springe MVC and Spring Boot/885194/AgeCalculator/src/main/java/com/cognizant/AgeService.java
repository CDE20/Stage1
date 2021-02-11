package com.cognizant;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeService {

	public String calculateAge(String date) {

		// add the code as per the requirement
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate birthDate = LocalDate.parse(date, formatter);
		LocalDate today = LocalDate.now();
		int years = Period.between(birthDate, today).getYears();
		int months = Period.between(birthDate, today).getMonths();
		int days = Period.between(birthDate, today).getDays();

		return "you are " + years + " years, " + months + " months, " + days + " days old.";
	}
}