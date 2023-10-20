package com.github.sekojuku.M6;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
//        System.out.println(convert("PAYPALISHIRING", 3));
        System.out.println(convert("A", 2));
//        System.out.println(convert("PAYPALISHIRING", 4));
    }


    public static String convert(String s, int numRows) {
        final var b = new StringBuilder();

        final var mp = new HashMap<Integer, String>();

        int i = 0;
        int threshold = numRows - 2;
        while (i < s.length()) {
            for (int j = 0; j < numRows && i < s.length(); j++, i++) {
                pushBack(mp, s, i, j);
            }
            for (int j = 0, index = threshold; j < threshold && i < s.length(); j++, index--, i++) {
                pushBack(mp, s, i, index);
            }
        }

        for (i = 0; i < numRows; i++) {
            b.append(mp.getOrDefault(i, ""));
        }

        return b.toString();
    }

    public static void pushBack(Map<Integer, String> mp, String s, int i, int j) {
        final var str = mp.getOrDefault(j, "");
        mp.put(j, String.format("%s%s", str, s.charAt(i)));
    }
}
