package com.spring.app;
import org.springframework.context.annotation.*;
@Configuration
public class ApplicationConfig {

@Bean
public Passport passport(){
    return new Passport();
}

@Bean
public Employee employee(){
    return new Employee();
}
    
}
