package com.github.arolfes.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codewars.com/kata/mexican-wave/train/java
 *
 */
public class MexicanWave {

    public static String[] wave(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }
            list.add(str.substring(0, i) + Character.toUpperCase(ch) + str.substring(i + 1));
        }
        return list.toArray(new String[0]);
    }

}
