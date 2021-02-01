package com.in28minutes.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class SpringbootfirstwebapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootfirstwebapplicationApplication.class, args);
	}

}
