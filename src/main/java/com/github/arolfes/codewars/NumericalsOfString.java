package com.github.arolfes.codewars;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codewars.com/kata/5b4070144d7d8bbfe7000001
 */
public class NumericalsOfString {

    public static String numericals(String s) {
        final StringBuilder result = new StringBuilder();
        final Map<String, Integer> counts = new HashMap<>();
        for (String c : s.split("")) {
            counts.put(c, 1 + counts.getOrDefault(c, 0));
            result.append(counts.get(c));
        }
        return result.toString();
    }

}
