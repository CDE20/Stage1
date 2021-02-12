package com.cts.rainbowjewellers.test;

import com.cts.rainbowjewellers.service.RainbowJewellersService;

import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RainbowJewellersParameterizedTest {

	RainbowJewellersService rainbowjewellers = new RainbowJewellersService();
	private double gram;
	private double expectedgoldprice;

	public RainbowJewellersParameterizedTest(double gram, double expectedgoldprice) {
		this.gram = gram;
		this.expectedgoldprice = expectedgoldprice;
	}

	@Parameters
	public static Collection testCondition() {
		Object expectedgoldprice[][] = { { 9.6, 48401.76 }, { 56, 282343.6 }, { 24.5, 123525.325 }, { 0.0, 0.0 },
				{ -1, -5041.85 } };
		return Arrays.asList(expectedgoldprice);
	}

	@Test
	public void testCalculateGoldPrice() {
		assertEquals(expectedgoldprice, rainbowjewellers.calculategoldprice(gram), 0.000001);
	}

}
