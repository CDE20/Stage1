package com.spring.app;

import org.springframework.context.annotation.*;

@Configuration
public class ApplicationConfig {
    
    @Bean 
   public Employee employee(){
      return new Employee();
   }
	
	 @Bean 
   public Passport passport(){
      return new Passport();
   }
}
