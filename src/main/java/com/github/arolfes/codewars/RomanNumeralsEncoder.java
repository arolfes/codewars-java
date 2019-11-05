package com.github.arolfes.codewars;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://www.codewars.com/kata/roman-numerals-encoder/train/java
 */
public class RomanNumeralsEncoder {

    private static final TreeMap<Integer, String> romans = Stream.of(
            new SimpleEntry<>(1000, "M"), 
            new SimpleEntry<>(900, "CM"), 
            new SimpleEntry<>(500, "D"), 
            new SimpleEntry<>(400, "CD"),
            new SimpleEntry<>(100, "C"), 
            new SimpleEntry<>(90, "XC"), 
            new SimpleEntry<>(50, "L"),
            new SimpleEntry<>(40, "XL"),
            new SimpleEntry<>(10, "X"), 
            new SimpleEntry<>(9, "IX"), 
            new SimpleEntry<>(5, "V"), 
            new SimpleEntry<>(4, "IV"),
            new SimpleEntry<>(1, "I"))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, TreeMap::new));

    public static String encodeNumberToRomanNumber(int i) {

        int l = romans.floorKey(i);
        if (i == l) {
            return romans.get(i);
        }
        return romans.get(l) + encodeNumberToRomanNumber(i - l);
    }
    
}
