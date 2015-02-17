package problem;

import com.github.thomaskeschl.eu.core.NaturalNumber;
import com.github.thomaskeschl.eu.core.NaturalNumberGenerator;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Solution for Project Euler: Problem 3 -
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 * Created by Thomas on 2/15/2015.
 */
public class Problem3 {
    public NaturalNumber solveFor(NaturalNumber num) {
        // generate primes up to the square root for checking, as an optimization
        // all composite numbers have prime factors less than or equal to their square roots
        NaturalNumber sqrt = num.squareRoot();
        List<NaturalNumber> primes = generatePrimesUpTo(sqrt);

        Optional<NaturalNumber> max = primes.parallelStream()
                .filter(num::isDivisibleBy)
                .max(NaturalNumber.ComparatorSingleton.INSTANCE);

        return max.get();
    }

    /**
     * Uses the Sieve of Eratosthenes to generate the prime numbers up to a given number.
     *
     * @param num the number to generate prime up to
     * @return A list of prime numbers up to the given limit.
     */
    private List<NaturalNumber> generatePrimesUpTo(NaturalNumber num) {
        List<NaturalNumber> candidates = new NaturalNumberGenerator().stream()
                .limit(num.getValue())
                .skip(2)
                .collect(Collectors.toList());

        List<NaturalNumber> primes = Lists.newArrayList();

        while (!candidates.isEmpty()) {
            NaturalNumber prime = candidates.remove(0);
            primes.add(prime);

            candidates = candidates.parallelStream()
                    .filter(n -> !n.isDivisibleBy(prime))
                    .collect(Collectors.toList());
        }

        return primes;
    }
}
