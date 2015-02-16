package problem;

import com.github.thomaskeschl.eu.core.NaturalNumber;
import com.github.thomaskeschl.eu.core.NaturalNumberGenerator;

import java.util.stream.Stream;

/**
 * Solution for Project Euler: Problem 1 -
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these
 * multiples is 23.
 *<p/>
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *<p/>
 * Created by Thomas on 2/7/2015.
 */
public class Problem1 {
    public NaturalNumber solveFor(long limit) {
        NaturalNumberGenerator naturalNumberGenerator = new NaturalNumberGenerator();
        Stream<NaturalNumber> naturalNumberStream = naturalNumberGenerator.stream();

        long sum = naturalNumberStream.limit(limit)
                .filter(num -> num.isDivisibleBy(3) || num.isDivisibleBy(5))
                .mapToLong(NaturalNumber::getValue)
                .sum();

        return new NaturalNumber(sum);
    }
}
