package com.github.arolfes.codewars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://www.codewars.com/kata/55fd2d567d94ac3bc9000064
 */
public class RowSumOddNumbers {

    public static int rowSumOddNumbers(int n) {
        Map<Integer, List<Integer>> triangle = prepareTriangle(n);
        return triangle.get(n).stream().mapToInt(Integer::intValue).sum();
    }

    private static Map<Integer, List<Integer>> prepareTriangle(int n) {
        Map<Integer, List<Integer>> triangle = new HashMap<>(n);
        Integer lastOdd = 0;
        for (int i = 1; i <= n; i++) {
            List<Integer> vals = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                lastOdd = getNextOdd(lastOdd);
                vals.add(lastOdd);
            }
            triangle.put(n, vals);
        }
        return triangle;
    }

    private static Integer getNextOdd(Integer i) {
        return i == 0 ? 1 : i + 2;
    }
}
