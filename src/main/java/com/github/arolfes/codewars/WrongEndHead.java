package com.github.arolfes.codewars;

import java.util.Arrays;
import java.util.Collections;

/**
 * https://www.codewars.com/kata/my-head-is-at-the-wrong-end/train/java
 *
 */
public class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr) {
        String[] copy = arr.clone();
        Collections.reverse(Arrays.asList(copy));
        return copy;
    }
}
