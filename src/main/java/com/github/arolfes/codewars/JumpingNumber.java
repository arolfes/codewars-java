package com.github.arolfes.codewars;

public class JumpingNumber {

  public static String jumpingNumber(int n) {
    final String s = "" + n;
    for (int i = 1; i < s.length(); i++) {
      if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != 1) {
        return "Not!!";
      }
    }
    return "Jumping!!";
  }
}
