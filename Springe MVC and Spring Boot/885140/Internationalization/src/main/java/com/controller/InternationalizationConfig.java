package com.controller;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SuppressWarnings("deprecation")
@Configuration
//@EnableWebMvc
public class InternationalizationConfig extends WebMvcConfigurerAdapter{

//Create a SessionLocaleResolver object and set the default locale to English  return the SessionLocaleResolver object  
	
	 @Bean  
    public InternalResourceViewResolver viewResolver() {  
	InternalResourceViewResolver resolver = new InternalResourceViewResolver();  
        resolver.setPrefix("/WEB-INF/jsp/");  
        resolver.setSuffix(".jsp");
        return resolver;  
    }
	@Bean
   public LocaleResolver localeResolver() {
       SessionLocaleResolver resolver = new SessionLocaleResolver();
       resolver.setDefaultLocale(Locale.US);
		return resolver;
   }
   
   //Create LocaleChangeInterceptor object and set the parameter name as language and return the localeChangeInterceptor
   @Bean
   public LocaleChangeInterceptor localeChangeInterceptor() {
	   LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
	   interceptor.setParamName("language");
	   return interceptor;

   }
   
   
   //register the LocaleChangeInterceptor
   @Override
   public void addInterceptors(InterceptorRegistry registry) {
	  registry.addInterceptor(localeChangeInterceptor());
      
   }
}