package com.github.thomaskeschl.eu.core;

/**
 * Created by tkeschl on 2/6/2015.
 */
public class NaturalNumber {
    private final int num;

    public NaturalNumber(int num) {
        if(num < 0) {
            String message = String.format("Natural numbers cannot be less than 0! Value: %1$s", num);
            throw new IllegalArgumentException(message);
        }

        this.num = num;
    }
}
