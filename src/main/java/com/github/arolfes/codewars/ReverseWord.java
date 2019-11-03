package com.github.arolfes.codewars;

/**
 * https://www.codewars.com/kata/reversed-strings/train/java
 */
public class ReverseWord {

    public static String solution(String str) {
        // Your code here...
        return new StringBuilder(str).reverse().toString();
    }
}
