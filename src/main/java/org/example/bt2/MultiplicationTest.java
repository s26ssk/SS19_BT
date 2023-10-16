package org.example.bt2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {
    @Test
    public void testMultiplicationWithPositiveNumbers() {
        double result = Multiplication.multiplication(5.0, 7.0);
        assertEquals(35.0, result, 0.001);
    }

    @Test
    public void testMultiplicationWithNegativeNumbers() {
        double result = Multiplication.multiplication(-5.0, -7.0);
        assertEquals(35.0, result, 0.001);
    }

    @Test
    public void testMultiplicationWithOneZero() {
        double result = Multiplication.multiplication(5.0, 0.0);
        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testMultiplicationWithBothZeros() {
        double result = Multiplication.multiplication(0.0, 0.0);
        assertEquals(0.0, result, 0.001);
    }
}
