package com.spring.app;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Employee employee() {
		Employee employee = new Employee();
		employee.setEmpId(1);
		employee.setEmpName("Atik");
		
		return employee;
	}
	
	@Bean
	public Passport passport() {
		Passport passport = new Passport();
		Date dateOfExpiry = new Date(121, 1, 22);
		passport.setDateOfExpiry(dateOfExpiry);
		Date dateOfIssue = new Date(121, 0, 1);
		passport.setDateOfIssue(dateOfIssue);
		passport.setPassNum(2);
		return passport;
	}
}
