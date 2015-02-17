package problem;

import com.github.thomaskeschl.eu.core.NaturalNumber;
import com.github.thomaskeschl.eu.core.NaturalNumberGenerator;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Solution for Project Euler: Problem 4 -
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is
 * 9009 = 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * Created by Thomas on 2/15/2015.
 */
public class Problem4 {
    NaturalNumber solveFor(int numDigits) {
        List<NaturalNumber> range = getRange(numDigits);
        Collections.reverse(range);

        Optional<NaturalNumber> result = range.stream()
                .flatMap(num -> range.stream().map(num::multiplyBy)) // new stream from each element times each element
                .filter(NaturalNumber::isPalindrome)
                .max(NaturalNumber.ComparatorSingleton.INSTANCE);

        return result.get();
    }

    /**
     * Gets the range of natural numbers that have the given number of digits.
     *
     * @param numDigits the number of digits to get a range of natural numbers for
     * @return A list of natural numbers that have the given number of digits.
     */
    private List<NaturalNumber> getRange(int numDigits) {
        return new NaturalNumberGenerator().stream()
                .limit((long) Math.pow(10, numDigits))
                .skip((long) Math.pow(10, numDigits - 1))
                .collect(Collectors.toList());
    }
}
