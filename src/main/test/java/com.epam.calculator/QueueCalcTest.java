package com.epam.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueCalcTest {
    private static final String QUEUE1 = "4 + 8 * 11 - 3 / 3 - 22 / 4 + sqrt 9";
    private static final String ANSWER1 = "88.5";
    private static final String QUEUE2 = "-3 + -4 / 2";
    private static final String ANSWER2 = "-5";
    private static final String QUEUE3 = "-3 + 3 + 0 * 3 / 4";
    private static final String QUEUE4 = "-3 - -3 + 1 * 3 / 4";
    private static final String ANSWER4 = "0.75";

    QueueCalculator queueCalculator = new QueueCalculator();

    @Test
    public void testQueue1(){
        assertEquals(ANSWER1,queueCalculator.getAnswer(QUEUE1));
    }
    @Test
    public void testQueue2(){
        assertEquals(ANSWER2,queueCalculator.getAnswer(QUEUE2));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testQueue3(){
        assertEquals("",queueCalculator.getAnswer(QUEUE3));
    }
    @Test
    public void testQueue4(){
        assertEquals(ANSWER4,queueCalculator.getAnswer(QUEUE4));
    }
}
