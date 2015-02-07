package com.github.thomaskeschl.eu.core;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class FibonacciGeneratorTest {

    private FibonacciGenerator fibonacciGenerator;

    @Before
    public void setUp() {
        fibonacciGenerator = new FibonacciGenerator();
    }

    @Test
    public void testIteratorGeneratesFirst10FibonnacciNumbers() throws Exception {
        List<Long> fibs = Lists.newArrayList(1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L, 55L);
        List<NaturalNumber> expected = fibs.stream().map(NaturalNumber::new).collect(Collectors.toList());

        List<NaturalNumber> actual = fibonacciGenerator.stream().limit(10).collect(Collectors.toList());

        assertEquals(expected, actual);
    }
}