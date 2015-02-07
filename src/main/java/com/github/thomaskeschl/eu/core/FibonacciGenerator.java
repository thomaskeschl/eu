package com.github.thomaskeschl.eu.core;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Generates the fibonacci sequence.
 * Created by Thomas on 2/7/2015.
 */
public class FibonacciGenerator implements Iterable<NaturalNumber> {
    private class FibonacciIterator implements Iterator<NaturalNumber> {
        private long x = 1;
        private long y = 1;

        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {
            return x + y < Long.MAX_VALUE;
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws java.util.NoSuchElementException if the iteration has no more elements
         */
        @Override
        public NaturalNumber next() {
            long z = y;
            y = x + y;
            x = z;
            return new NaturalNumber(z);
        }
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<NaturalNumber> iterator() {
        return new FibonacciIterator();
    }

    public Stream<NaturalNumber> stream() {
        return StreamSupport.stream(spliterator(), false);
    }
}
