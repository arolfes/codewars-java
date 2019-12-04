package com.github.arolfes.codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/find-first-missing-positive-integer-in-o-n-complexity
 * 
 * also a question in a job interview
 *
 */
public class SmallestPositivInteger {

    public static int solution(int[] ar) {
        
        List<Integer> values = Arrays.stream(ar).boxed().sorted().filter(i -> i > 0).collect(Collectors.toList());
        int result = 1;
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) == result) {
                result++;
            } else if (result == i) {
                break;
            }

        }
        return result;
    }
}
