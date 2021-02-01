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

	private double gram;
	private double expected;
	
	

	public RainbowJewellersParameterizedTest(double gram, double expected) {
		super();
		this.gram = gram;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<double[]> testCondition(){
		
		double expectedOutput[][] = {
				{9.60,48401.76,0.2},
				{0.0,0.0,0.2},
				{56.0,282343.6,0.2},
				{24.5,123525.325,0.2},
				{-1,-5041.85,0.2}
		};
		
		return Arrays.asList(expectedOutput);
	}



	@Test
	public void testCalculateGoldPrice() {
	
	     //fill code here
		RainbowJewellersService RJS = new RainbowJewellersService();
		assertEquals(expected,RJS.calculategoldprice(gram),0.2);
		
	}

}
