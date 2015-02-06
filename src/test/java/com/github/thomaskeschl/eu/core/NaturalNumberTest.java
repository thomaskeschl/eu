package com.github.thomaskeschl.eu.core;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NaturalNumberTest {

    private NaturalNumber num;

    @Before
    public void setUp() throws Exception {
        num = new NaturalNumber(10L);
    }

    @Test
    public void testIsDivisibleBy() throws Exception {
        assertEquals(true, num.isDivisibleBy(new NaturalNumber(2)));
    }

    @Test
    public void testIsDivisibleByFailsWhenNotDivisible() throws Exception {
        assertEquals(false, num.isDivisibleBy(new NaturalNumber(3)));
    }
}