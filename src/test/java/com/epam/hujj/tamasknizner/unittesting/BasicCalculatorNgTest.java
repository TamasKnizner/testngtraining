package com.epam.hujj.tamasknizner.unittesting;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicCalculatorNgTest {

	private BasicCalculator underTest;

	@BeforeMethod
	public void setup() {
		underTest = new BasicCalculator();
	}

	@DataProvider(name = "numbers")
	public Object[][] provideNumbers() {
		return new Object[][] { { 1, 2, 3 }, { 0, 0, 0 }, { -41, 41, 0 } };
	}

	@Test(dataProvider = "numbers")
	public void testSumShouldReturnSumOfParams(final int a, final int b, final int expected) {
		// GIVEN in setup
		// WHEN
		long result = underTest.sum(a, b);
		// THEN
		Assert.assertEquals(result, expected);
	}

}
