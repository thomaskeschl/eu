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

    @Test
    public void testSquareRoot() throws Exception {
        NaturalNumber expected = new NaturalNumber(3);
        assertEquals(expected, num.squareRoot());
    }

    @Test
    public void testIsPalindrome() throws Exception {
        NaturalNumber test = new NaturalNumber(9009);
        assertEquals(true, test.isPalindrome());
    }

    @Test
    public void testIsPalindromeFalseWhenNotPalindrome() throws Exception {
        assertEquals(false, num.isPalindrome());
    }

    @Test
    public void testMultiplyBy() throws Exception {
        NaturalNumber expected = new NaturalNumber(100);
        assertEquals(expected, num.multiplyBy(num));
    }
}