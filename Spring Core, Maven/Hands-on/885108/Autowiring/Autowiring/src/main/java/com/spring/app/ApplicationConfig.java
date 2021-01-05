package com.spring.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Passport passport(){
		Passport passport = new Passport();
		passport.setPassNum(12);
		try {
			passport.setDateOfExpiry(new SimpleDateFormat("dd-MM-yyyy").parse("28-12-2023"));
			passport.setDateOfIssue(new SimpleDateFormat("dd-MM-yyyy").parse("28-12-2020"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return passport;
	}
	
	@Bean
	public Employee employee(){
		Employee emp = new Employee();
		emp.setEmpId(232);
		emp.setEmpName("Akshat");
		return emp;
	}

	
}
