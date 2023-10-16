package org.example.bt3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest {
    @Test
    public void testDivisionWithPositiveNumbers() {
        double result = Division.division(10.0, 2.0);
        assertEquals(5.0, result, 0.001);
    }

    @Test
    public void testDivisionWithNegativeNumbers() {
        double result = Division.division(-10.0, -2.0);
        assertEquals(5.0, result, 0.001);
    }

    @Test
    public void testDivisionWithZeroDenominator() {
        double result = Division.division(5.0, 0.0);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.001);
    }

    @Test
    public void testDivisionByZero() {
        double result = Division.division(0.0, 5.0);
        assertEquals(0.0, result, 0.001);
    }
}
