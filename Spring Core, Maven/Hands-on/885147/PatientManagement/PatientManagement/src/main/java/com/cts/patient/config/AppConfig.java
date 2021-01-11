package com.cts.patient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import com.cts.patient.model.Patient;
import com.cts.patient.service.PatientService;

//fill the code
@Configuration
@ComponentScan
@PropertySource("classpath:patient_details.properties")
public class AppConfig {

	//fill the code
	 @Bean
	    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
	        return new PropertySourcesPlaceholderConfigurer();
	    }
	 
	@Bean 
	public PatientService passport() {
	    return new PatientService();
	}
	
	@Bean
	public Patient patient() {
		return new Patient();
	}
}
