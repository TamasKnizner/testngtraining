package com.epam.hujj.tamasknizner.unittesting;

import org.junit.Test;
import java.util.Random;
import org.junit.Assert;
import org.junit.Before;

public class BasicCalculatorTest {

	private BasicCalculator bc;
	private int a;
	private int b;
	private int zero;

	@Before
	public void setup() {
		bc = new BasicCalculator();
		zero = 0;
		//Could be some random integer...
		a = 615;
		b = -354;
	}

	@Test
	public void testSum() {
		//GIVEN
		/*
		 * int mx = Integer.MAX_VALUE; long mxs = (long) mx + mx; long
		 * testedMaxValue = bc.sum(mx, mx); Assert.assertEquals(mxs,
		 * testedMaxValue);
		 * 
		 * int mn = Integer.MIN_VALUE; long mns = (long) mn + mn; long
		 * testedMinValue = bc.sum(mn, mn); Assert.assertEquals(mns,
		 * testedMinValue);
		 */
		//WHEN
		long sumOfAandB = bc.sum(a, b);
		long sumOfBandA = bc.sum(b, a);
		long sumOfNumberAndZero = bc.sum(a, zero);
		
		//THEN
		Assert.assertEquals(a, sumOfNumberAndZero);
		Assert.assertEquals(sumOfAandB, sumOfAandB);
		Assert.assertEquals(sumOfAandB, sumOfBandA);
	}

	@Test
	public void testMultiply() {
		//GIVEN

		//WHEN
		long expectedToBeZero = (long) new Random().nextInt() * zero;
		long productOfAandB = bc.multiply(a, b);
		long productOfBandA = bc.multiply(b, a);
		long expectedToBePositive1 = bc.multiply(a, a);
		long expectedToBePositive2 = bc.multiply(b, b);
		long expectedToBeNegative = bc.multiply(a, b);
		
		//THEN
		Assert.assertEquals(zero, expectedToBeZero);
		Assert.assertEquals(productOfAandB, productOfAandB);
		Assert.assertEquals(productOfBandA, productOfAandB);
		Assert.assertTrue(expectedToBePositive1 > 0);
		Assert.assertTrue(expectedToBePositive2 > 0);
		Assert.assertTrue(expectedToBeNegative < 0);

	}

	@Test
	public void testDivide() {
		//GIVEN

		//WHEN
		float quotientOfAandB = (float) a / b;
		float calculatedQuotient = bc.divide(a, b);
		
		//THEN
		Assert.assertEquals(quotientOfAandB, calculatedQuotient, 1.0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivideForZero() {
		//GIVEN
		Assert.assertNotNull(bc);
		
		//WHEN
		bc.divide(zero, zero);
		bc.divide(a, zero);
		bc.divide(b, zero);
		
		//THEN exception is thrown
		
		
	}

}
