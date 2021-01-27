package com.cts.rainbowjewellers.test;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.cts.rainbowjewellers.service.RainbowJewellersService;


@RunWith(Parameterized.class)
public class RainbowJewellersParameterizedTest {

	 private double gram;
	 private double expectedgoldprice;
	 
	 RainbowJewellersService rainbowJewellersService = new RainbowJewellersService();
	 
	 public RainbowJewellersParameterizedTest(double gram,double expectedgoldprice){
	     this.gram=gram;
	     this.expectedgoldprice=expectedgoldprice;
	 }
	 
	 @Parameters
	 public static Collection<Double[]> testData(){
	     Double expectedgoldprice[][] = {{9.6,48401.76},{(double)56.0,282343.6},{24.5,123525.325},{(double)0.0,0.0},{(double)-1,-5041.85}};
	     return Arrays.asList(expectedgoldprice);
	 }
	 
	 @Test
	 public void testCalculateGoldPrice() {
		 assertTrue(expectedgoldprice == rainbowJewellersService.calculategoldprice(gram));
	}

}
