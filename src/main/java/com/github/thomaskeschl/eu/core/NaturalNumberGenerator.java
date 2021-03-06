package com.github.thomaskeschl.eu.core;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Generates a stream of natural numbers, in order.
 *
 * Created by tkeschl on 2/6/2015.
 */
public class NaturalNumberGenerator implements Iterable<NaturalNumber> {
    private class NaturalNumberIterator implements Iterator<NaturalNumber> {
        private long num = 0;

        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {
            return num < Long.MAX_VALUE;
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws java.util.NoSuchElementException if the iteration has no more elements
         */
        @Override
        public NaturalNumber next() {
            return new NaturalNumber(num++);
        }
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<NaturalNumber> iterator() {
        return new NaturalNumberIterator();
    }

    public Stream<NaturalNumber> stream() {
        return StreamSupport.stream(spliterator(), false);
    }
}
