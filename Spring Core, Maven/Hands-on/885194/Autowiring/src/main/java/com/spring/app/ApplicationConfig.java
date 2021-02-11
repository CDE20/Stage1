package com.spring.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@Configuration
@ComponentScan
public class ApplicationConfig {
	
	@Bean 
	public Passport passport() {
	    return new Passport();
	}
    
	@Bean 
	public Employee employee() {
	    return new Employee();
	}
}
