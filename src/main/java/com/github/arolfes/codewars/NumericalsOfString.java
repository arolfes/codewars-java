package com.github.arolfes.codewars;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codewars.com/kata/5b4070144d7d8bbfe7000001
 */
public class NumericalsOfString {

    public static String numericals(String input) {
        final StringBuilder result = new StringBuilder();
        final Map<Integer, Integer> counts = new HashMap<>();
        input.codePoints().boxed().forEach(i -> {
            Integer sum = counts.getOrDefault(i, 1);
            result.append(sum);
            counts.put(i, sum + 1);
        });
        return result.toString();
    }

}
