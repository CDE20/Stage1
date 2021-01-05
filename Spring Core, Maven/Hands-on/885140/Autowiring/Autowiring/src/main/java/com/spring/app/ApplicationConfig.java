package com.spring.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.spring.app"})
public class ApplicationConfig {

	@Bean
	public Employee getEmployee() {
		return new Employee();
	
}
	@Bean
	public Passport passport() {
		return new Passport();
	}
}
