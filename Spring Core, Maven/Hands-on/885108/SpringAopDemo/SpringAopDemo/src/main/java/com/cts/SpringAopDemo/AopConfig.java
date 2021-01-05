package com.cts.SpringAopDemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//Type your code here
//Type your code here
//Type your code here
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.cts.SpringAopDemo")
public class AopConfig {
	
	@Bean
	public EasyBank easyBank(){
	    return new EasyBank();
	}
	
	@Bean 
	public LoginAspect loginAspect(){
	    return new LoginAspect();
	}
	
}
