package com.github.arolfes.codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collector;

public class ValidateParenthesis {

  private static final List<Character> PARENTHESIS_LIST =
      Arrays.asList('[', ']', '(', ')', '{', '}');

  private static final Map<Character, Character> PARENTHESIS_MAP =
      createParenthesisMap(PARENTHESIS_LIST);

  public static boolean validate(String input) {

    String newStr = removeAllNonParenthesisCharacters(input);

    // if we don't have 2 chars something is wrong
    if (newStr.length() % 2 != 0) {
      return false;
    }

    Stack<Character> stack = new Stack<>();
    for (char ch : newStr.toCharArray()) {
      if (PARENTHESIS_MAP.containsKey(ch)) {
        // add open parenthesis to stack
        stack.push(ch);
      } else if (PARENTHESIS_MAP.containsValue(ch)) {
        // check if last entry from stack return the same value from as the current closing
        // parenthesis
        if (stack.isEmpty() || PARENTHESIS_MAP.get(stack.pop()) != ch) {
          return false;
        }
      }
    }
    return stack.isEmpty();

  }

  private static String removeAllNonParenthesisCharacters(String input) {
    return input.codePoints()
                .mapToObj(c -> (char) c)
                .filter(c -> PARENTHESIS_LIST.contains(c))
                .collect(Collector.of(
                    StringBuilder::new, 
                    StringBuilder::append, 
                    StringBuilder::append,
                    StringBuilder::toString));
  }

  private static Map<Character, Character> createParenthesisMap(List<Character> parenthesis) {
    Map<Character, Character> mp = new HashMap<>();
    for (int i = 0; i < parenthesis.size();) {
      mp.put(parenthesis.get(i), parenthesis.get((i + 1)));
      i = i+2;
    }
    return mp;
  }
}
