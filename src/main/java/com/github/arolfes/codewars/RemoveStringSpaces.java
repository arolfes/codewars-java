package com.github.arolfes.codewars;

/**
 * https://www.codewars.com/kata/remove-string-spaces/train/java
 *
 */
public class RemoveStringSpaces {

  static String noSpace(final String x) {
    return x.chars().mapToObj(i -> (char) i).filter(i -> !i.equals(' '))
        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
  }
}
