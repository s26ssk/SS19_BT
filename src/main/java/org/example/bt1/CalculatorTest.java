package org.example.bt1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddPositiveNumbers() {
        double result = calculator.add(5.0, 7.0);
        assertEquals(12.0, result, 0.001);
    }

    @Test
    public void testAddNegativeNumbers() {
        double result = calculator.add(-5.0, -7.0);
        assertEquals(-12.0, result, 0.001);
    }

    @Test
    public void testAddWithZero() {
        double result = calculator.add(0.0, 5.0);
        assertEquals(5.0, result, 0.001);
        result = calculator.add(5.0, 0.0);
        assertEquals(5.0, result, 0.001);
        result = calculator.add(0.0, 0.0);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testSubtractPositiveNumbers() {
        double result = calculator.subtract(10.0, 3.0);
        assertEquals(7.0, result, 0.001);
    }

    @Test
    public void testSubtractNegativeNumbers() {
        double result = calculator.subtract(-10.0, -3.0);
        assertEquals(-7.0, result, 0.001);
    }

    @Test
    public void testSubtractWithZero() {
        double result = calculator.subtract(10.0, 0.0);
        assertEquals(10.0, result, 0.001);
        result = calculator.subtract(0.0, 7.0);
        assertEquals(-7.0, result, 0.001);
        result = calculator.subtract(0.0, 0.0);
        assertEquals(0.0, result, 0.001);
    }
}
