package com.github.arolfes.codewars;

import java.util.Map;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://www.codewars.com/kata/highest-scoring-word/train/java
 */
public class HighestScoringWord {

  private static final Map<String, Integer> scores =
      Stream
          .of(new Object[][] {{"a", 1}, {"b", 2}, {"c", 3}, {"d", 4}, {"e", 5}, {"f", 6}, {"g", 7}, {"h", 8}, {"i", 9}, {"j", 10},
              {"k", 11}, {"l", 12}, {"m", 13}, {"n", 14}, {"o", 15}, {"p", 16}, {"q", 17}, {"r", 18}, {"s", 19}, {"t", 20}, {"u", 21},
              {"v", 22}, {"w", 23}, {"x", 24}, {"y", 25}, {"z", 26},})
          .collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

  public static String high(String s) {
    String[] words = s.split(" ");
    Object[] wordScore = new Object[] {Integer.valueOf(0), ""};
    
    for (String word : words) {
      Object[] wordScoreNew = calculateWordScore(word);
      if ((Integer)wordScoreNew[0] > (Integer)wordScore[0]) {
        wordScore = wordScoreNew;
      }
    }
    return (String)wordScore[1];
  }

  private static Object[] calculateWordScore(String word) {
    int wordScoreValue = word.codePoints().mapToObj(c -> String.valueOf((char) c)).mapToInt(new ToIntFunction<String>() {

      @Override
      public int applyAsInt(String value) {
        return scores.get(value);
      }
    }).sum();

    return new Object[] {Integer.valueOf(wordScoreValue), word};
  }
}
