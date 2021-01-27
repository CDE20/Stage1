package com.cts.SpringAopDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Configuration
@ComponentScan("com.cts.SpringAopDemo")
@EnableAspectJAutoProxy
public class AopConfig {
	
	
}
