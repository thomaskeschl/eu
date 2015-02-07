package com.github.thomaskeschl.eu.core;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NaturalNumberTest {

    private NaturalNumber num;

    @Before
    public void setUp() throws Exception {
        num = new NaturalNumber(10);
    }

    @Test
    public void testIsDivisibleBy() throws Exception {
        assertEquals(true, num.isDivisibleBy(new NaturalNumber(2)));
    }

    @Test
    public void testIsDivisibleByFailsWhenNotDivisible() throws Exception {
        assertEquals(false, num.isDivisibleBy(new NaturalNumber(3)));
    }

    @Test
    public void testCompareToLessThan() throws Exception {
        assertEquals(-1, num.compareTo(new NaturalNumber(11)));
    }

    @Test
    public void testCompareToEqual() throws Exception {
        assertEquals(0, num.compareTo(new NaturalNumber(10)));
    }

    @Test
    public void testCompareToGreaterThan() throws Exception {
        assertEquals(1, num.compareTo(new NaturalNumber(9)));
    }
}