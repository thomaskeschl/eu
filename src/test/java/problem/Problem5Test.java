package problem;

import com.github.thomaskeschl.eu.core.NaturalNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem5Test {

    private Problem5 problem;

    @Before
    public void setUp() throws Exception {
        problem = new Problem5();
    }

    @Test
    public void testSolveFor10() throws Exception {
        NaturalNumber expected = new NaturalNumber(2520);

        assertEquals(expected, problem.solveFor(10));
    }

    @Test
    public void testSolveFor20() throws Exception {
        NaturalNumber expected = new NaturalNumber(232792560);

        assertEquals(expected, problem.solveFor(20));
    }
}