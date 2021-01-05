package com.cts.SpringAopDemo;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//Type your code here
@Configuration
//Type your code here
@EnableAspectJAutoProxy
//Type your code here
@ComponentScan(basePackages = {"com.cts.SpringAopDemo"})
public class AopConfig {
	
	@Bean
	public EasyBank easyBank() {
		return new EasyBank();
	}
	
	@Bean
	public LoginAspect loginAspect() {
		return new LoginAspect();
	}
	
}
