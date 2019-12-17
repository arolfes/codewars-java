package com.github.arolfes.codewars;

public class ValidateArithmeticFunction {


  public static boolean validate(String input) {


    try {
      return checkParenthisis(input);
    } catch (IndexOutOfBoundsException e) {
      return false;
    }
  }

  private static boolean checkParenthisis(String str) {
    boolean result = false;
    if (str.indexOf("[") != -1) {
      result = checkParenthisis(str, "[", "]");
      if (!result) {
        return result;
      }
    }
    if (str.indexOf("(") != -1) {
      result = checkParenthisis(str, "(", ")");
      if (!result) {
        return result;
      }
    }
    if (str.indexOf("{") != -1) {
      result = checkParenthisis(str, "{", "}");
      if (!result) {
        return result;
      }
    }

    return result;
  }

  
  private static boolean checkParenthisis(String str, String open, String close) {
    String substring = str.substring(str.indexOf(open) + 1, str.lastIndexOf(close));
    if (substring.contains("[") || substring.contains("(") || substring.contains("{")) {
      return checkParenthisis(substring);
    }
    return true;
  }
}
