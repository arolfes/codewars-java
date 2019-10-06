package com.github.arolfes.codewars;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://www.codewars.com/kata/highest-scoring-word/train/java
 */
public class HighestScoringWord {

  public static String high(String s) {
    return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get(); 
  }
}
