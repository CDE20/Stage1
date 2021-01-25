package com.cts.rainbowjewellers.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.cts.rainbowjewellers.service.RainbowJewellersService;

@RunWith(Parameterized.class)
public class RainbowJewellersParameterizedTest {
	
	private double gram;
	private double expectedgoldprice;
	
	RainbowJewellersService rjs = new RainbowJewellersService();
	
	@Parameters
	public static Collection<Double[]> providingParameters(){
		Double[][] arr = {{9.6,48401.76},{56.00,282343.6},{24.6,124029.51},{0.0,0.0},{-1.0,-5041.85}};
		return Arrays.asList(arr);
		
	}
	
	public RainbowJewellersParameterizedTest(double gram, double expectedgoldprice) {
		//super();
		this.gram = gram;
		this.expectedgoldprice = expectedgoldprice;
	}
	
	
	
	@Test
	public void testCalculateGoldPrice() {
		Assert.assertEquals(expectedgoldprice,rjs.calculategoldprice(gram),0.9);
		
	}

}
