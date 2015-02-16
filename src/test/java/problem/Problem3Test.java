package problem;

import com.github.thomaskeschl.eu.core.NaturalNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem3Test {

    private Problem3 problem;

    @Before
    public void setUp() {
        problem = new Problem3();
    }

    @Test
    public void testSolveFor13195() throws Exception {
        NaturalNumber expected = new NaturalNumber(29);

        NaturalNumber actual = problem.solveFor(new NaturalNumber(13195));

        assertEquals(expected, actual);
    }

    @Test
    public void testSolveFor600851475143() throws Exception {
        NaturalNumber expected = new NaturalNumber(6857);

        NaturalNumber actual = problem.solveFor(new NaturalNumber(600851475143L));

        assertEquals(expected, actual);
    }
}