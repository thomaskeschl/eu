package com.github.thomaskeschl.eu.core;

/**
 * Created by tkeschl on 2/6/2015.
 */
public class NaturalNumber {
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

        if (num != that.num) return false;

        return true;
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
}
