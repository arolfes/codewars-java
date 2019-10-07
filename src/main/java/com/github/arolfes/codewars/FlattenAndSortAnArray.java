package com.github.arolfes.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/57ee99a16c8df7b02d00045f
 */
public class FlattenAndSortAnArray {

  public static int[] flattenAndSort(int[][] array) {
    return flattenToInt(array).sorted().toArray();
  }

  private static IntStream flattenToInt(Object o) {
    return o instanceof int[] ? Arrays.stream((int[]) o)
        : o instanceof Object[] ? Arrays.stream((Object[]) o).flatMapToInt(x -> flattenToInt(x)) 
            : IntStream.of(((Number) o).intValue());
  }
}
