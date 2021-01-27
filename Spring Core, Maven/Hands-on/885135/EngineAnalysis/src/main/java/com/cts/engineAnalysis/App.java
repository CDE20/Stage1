package com.cts.engineAnalysis;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	new SkeletonValidator();
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        
        Scanner scanner =new Scanner(System.in);
        Car car=null;
        System.out.println("Select option\n 1.Petrol Engine \n 2.Diesel Engine");
        int choice=scanner.nextInt();
        
        if(choice==1){
            car=(Car)context.getBean("petrolCar");

        }else if(choice==2){
        car=(Car)context.getBean("dieselCar");
        }
        else{
        	System.out.println("wrong choice");
        	return;
        }
        car.getReport();
    }
}
