package com.github.arolfes.codewars;

public class JumpingNumber {

  public static String jumpingNumber(int number)
  {
      String num = ""+number;
      int length = num.length();
      if (length > 1) {
        for (int i = 0; i < length-1; i++) {
          int pos1= Character.getNumericValue(num.charAt(i));
          int trailingNumber= Character.getNumericValue(num.charAt(i+1));
          if (((pos1 + 1) != trailingNumber) && ((pos1 - 1) != trailingNumber)) {
            return "Not!!";
          }
        }
      }
      return "Jumping!!";
  }
}
