package com.github.arolfes.codewars;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/57ee99a16c8df7b02d00045f
 */
public class FlattenAndSortAnArray {

  public static int[] flattenAndSort(int[][] array) {
    return Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();
  }

}
