package problem;

import com.codepoetics.protonpack.StreamUtils;
import com.github.thomaskeschl.eu.core.FibonacciGenerator;
import com.github.thomaskeschl.eu.core.NaturalNumber;

import java.util.stream.Stream;

/**
 * Solution for Project Euler: Problem 2 -
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the
 * first 10 terms will be:
 * <p/>
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * <p/>
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the
 * even-valued terms.
 * <p/>
 * Created by Thomas on 2/7/2015.
 */
public class Problem2 {
    public NaturalNumber solveFor(NaturalNumber maxFib) {
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
        Stream<NaturalNumber> naturalNumberStream = fibonacciGenerator.stream();

        // FIXME replace imported package stream utils with takeWhile method of own construction
        long sum = StreamUtils.takeWhile(naturalNumberStream, num -> num.compareTo(maxFib) <= 0)
                .filter(num -> num.isDivisibleBy(2))
                .mapToLong(NaturalNumber::getValue)
                .sum();

        return new NaturalNumber(sum);
    }
}