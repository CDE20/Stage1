package com.cts.rainbowjewellers.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.cts.rainbowjewellers.service.RainbowJewellersService;

@RunWith(Parameterized.class)
public class RainbowJewellersParameterizedTest {
    
        
	     //fill code here
	     
	     private double gram;
	     private double expectedgoldprice;
	     
	     public RainbowJewellersParameterizedTest(double gram , double expectedgoldprice){
	         this.gram= gram;
	         this.expectedgoldprice = expectedgoldprice;
	     }
	     
	     @Parameters
	     public static Collection<Double[]>testConditions(){
	         Double expectedOps[][] = {{ 9.6, 48401.76}, {56.0, 282343.6}, {24.5, 123525.325}, {0.0, 0.0}, {-1.0, -5041.85}};
	         
	         return Arrays.asList(expectedOps);
	     }

	   @Test
	   public void testCalculateGoldPrice() {
	       RainbowJewellersService service = new RainbowJewellersService();
	       assertEquals(expectedgoldprice , service.calculategoldprice(gram), 0.1);
	   }

}
