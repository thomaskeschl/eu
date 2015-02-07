package problem;

import com.github.thomaskeschl.eu.core.NaturalNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem1Test {

    Problem1 problem1;

    @Before
    public void setUp() throws Exception {
        problem1 = new Problem1();
    }

    @Test
    public void testSolveFor10() throws Exception {
        NaturalNumber actual = problem1.solveFor(10);

        NaturalNumber expected = new NaturalNumber(23);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolveFor1000() throws Exception {
        NaturalNumber actual = problem1.solveFor(1000);

        NaturalNumber expected = new NaturalNumber(233168);

        assertEquals(expected, actual);
    }
}