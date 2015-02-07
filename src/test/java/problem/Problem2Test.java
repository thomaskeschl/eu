package problem;

import com.github.thomaskeschl.eu.core.NaturalNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem2Test {

    Problem2 problem;

    @Before
    public void setUp() throws Exception {
        problem = new Problem2();
    }

    @Test
    public void testSolveForLessThan100() throws Exception {
        NaturalNumber expected = new NaturalNumber(44);

        NaturalNumber actual = problem.solveFor(new NaturalNumber(100));

        assertEquals(expected, actual);
    }

    @Test
    public void testSolveForLessThan4Million() throws Exception {
        NaturalNumber expected = new NaturalNumber(4613732);

        NaturalNumber actual = problem.solveFor(new NaturalNumber(4000000));

        assertEquals(expected, actual);
    }
}