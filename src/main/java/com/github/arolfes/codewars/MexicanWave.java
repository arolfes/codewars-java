package com.github.arolfes.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codewars.com/kata/mexican-wave/train/java
 *
 */
public class MexicanWave {

    public static String[] wave(String str) {
        if (str == null || "".equals(str)) {
            return new String[0];
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            result.add(upperCaseCharAndConvertToString(i, str));
        }
        return result.stream().toArray(String[]::new);
    }


    private static String upperCaseCharAndConvertToString(int charPosForUppercase, String str) {
        StringBuilder bu = new StringBuilder(str);
        bu.replace(charPosForUppercase, charPosForUppercase + 1,
                Character.toString(Character.toUpperCase(str.charAt(charPosForUppercase))));
        return bu.toString();
    }
}
