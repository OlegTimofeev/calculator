package com.epam.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {

    Calculator calculator = new Calculator();

    @Test
    public void addTest(){
        assertEquals(4.0,calculator.add(2,2));
        assertEquals(4.5,calculator.add(2,2.5));
        assertEquals(5.0,calculator.add(2.5,2.5));
    }
    @Test
    public void subtractionTest(){
        assertEquals(2.0,calculator.sub(4,2));
        assertEquals(1.5,calculator.sub(4,2.5));
        assertEquals(0.0,calculator.sub(2.5,2.5));
    }
    @Test
    public void multiplicationTest(){
        assertEquals(6.0,calculator.mult(3,2));
        assertEquals(5.0,calculator.mult(2,2.5));
        assertEquals(6.25,calculator.mult(2.5,2.5));
    }
    @Test
    public void divisionTest(){
        assertEquals(4.5,calculator.div(9,2));
        assertEquals(2.0,calculator.div(5,2.5));
    }
    @Test(expected = IllegalArgumentException.class)
    public void divisionTestErr(){
        calculator.div(3,0);

    }
    @Test
    public void sqrtTest(){
        assertEquals(3.0,calculator.sqrt(9));
        assertEquals(3.1623,calculator.sqrt(10));
    }
    @Test(expected = IllegalArgumentException.class)
    public void sqrtTestErr(){
        calculator.sqrt(-1);
    }
}