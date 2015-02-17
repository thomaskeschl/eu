package problem;

import com.github.thomaskeschl.eu.core.NaturalNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem4Test {

    private Problem4 problem;

    @Before
    public void setUp() throws Exception {
        problem = new Problem4();
    }

    @Test
    public void testSolveFor2Digits() throws Exception {
        NaturalNumber expected = new NaturalNumber(9009);

        NaturalNumber actual = problem.solveFor(2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSolveFor3Digits() throws Exception {
        NaturalNumber expected = new NaturalNumber(906609);

        NaturalNumber actual = problem.solveFor(3);

        assertEquals(expected, actual);
    }
}