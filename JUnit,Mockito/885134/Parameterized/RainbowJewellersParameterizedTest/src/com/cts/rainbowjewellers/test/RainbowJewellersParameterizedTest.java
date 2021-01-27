package com.cts.rainbowjewellers.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.cts.rainbowjewellers.service.RainbowJewellersService;

@RunWith(Parameterized.class)
public class RainbowJewellersParameterizedTest {
    public double gram;
    double expectedgoldprice;
    RainbowJewellersService obj=new RainbowJewellersService();

    public RainbowJewellersParameterizedTest(double gram,double expectedgoldprice) {
        this.gram=gram;
        this.expectedgoldprice=expectedgoldprice;
    }

@Parameters
public static Collection<Double[]> testConditions(){
	Double expectedOutput[][]= {
			
			{9.6 ,48401.76},
			{56.0 ,282343.6},
			{24.5,123525.325},
			{0.0,0.0},
			{-1.0,-5041.85}
	};
return Arrays.asList(expectedOutput);
}


@Test
public void testCalculateGoldPrice() {
assertEquals(expectedgoldprice, obj.calculategoldprice(gram), 1.0);	
	}
		
	

}
