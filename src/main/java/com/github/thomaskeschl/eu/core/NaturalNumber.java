package com.github.thomaskeschl.eu.core;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

/**
 * Represents a natural number, which is an integer in the range 0-Infinity.
 *
 * Created by tkeschl on 2/6/2015.
 */
public class NaturalNumber implements Comparable<NaturalNumber> {

    public static enum ComparatorSingleton implements Comparator<NaturalNumber> {
        INSTANCE;

        @Override
        public int compare(NaturalNumber o1, NaturalNumber o2) {
            return o1.compareTo(o2);
        }
    }

    private final long num;

    public NaturalNumber(long num) {
        if(num < 0) {
            String message = String.format("Natural numbers cannot be less than 0! Value: %1$s", num);
            throw new IllegalArgumentException(message);
        }

        this.num = num;
    }

    public boolean isDivisibleBy(NaturalNumber other) {
        return num % other.num == 0;
    }

    public boolean isDivisibleBy(long other) {
        return num % other == 0;
    }

    public long getValue() {
        return num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NaturalNumber that = (NaturalNumber) o;

        return num == that.num;

    }

    @Override
    public int hashCode() {
        return (int) (num ^ (num >>> 32));
    }

    @Override
    public String toString() {
        return "NaturalNumber{" +
                "num=" + num +
                '}';
    }

    @Override
    public int compareTo(@NotNull NaturalNumber other) {
        return Long.compare(num, other.num);
    }
}
