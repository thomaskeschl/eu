package problem;

import com.github.thomaskeschl.eu.core.NaturalNumber;
import com.github.thomaskeschl.eu.core.NaturalNumberGenerator;

import java.util.Optional;


/**
 * Solution for Project Euler: Problem 5 -
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * <p>
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * Created by Thomas on 2/16/2015.
 */
public class Problem5 {
    public NaturalNumber solveFor(int firstXNumbers) {
        NaturalNumberGenerator naturalNumberGenerator = new NaturalNumberGenerator();

        Optional<NaturalNumber> result = naturalNumberGenerator.stream()
                .skip(1) // skip 0
                .filter(num -> naturalNumberGenerator.stream()
                        .limit(firstXNumbers + 1) // shift the end point one increment to the right
                        .skip(1) // shift the beginning point one increment to the right
                        .allMatch(num::isDivisibleBy))
                .findFirst();

        return result.get();
    }
}
