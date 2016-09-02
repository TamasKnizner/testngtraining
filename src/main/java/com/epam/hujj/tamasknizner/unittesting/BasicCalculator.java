package com.epam.hujj.tamasknizner.unittesting;

/**
 * Provides basic mathematical calculation.
 *
 */
public class BasicCalculator {
    /**
     * Sums parameters.
     * @param a integer a to sum
     * @param b integer b to sum
     * @return sum of a and b
     */
    public long sum(int a, int b) {
        return a + b;
    }
    
    /**
     * Multiplies parameters.
     * @param a integer to multiply
     * @param b multiplier
     * @return multiplication of a and b
     */
    public long multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides parameters.
     * @param dividend integer to divide
     * @param divisor integer as the divisor
     * @return dividend divided by the divisor
     */
    public float divide(int dividend, int divisor) {
        float result;
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        } else {
            result = Float.valueOf(dividend) / Float.valueOf(divisor);
        }
        return result;
    }
}
