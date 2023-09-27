package com.github.sekojuku.E14;

public class Solution {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        var builder = new StringBuilder();

        var min = Integer.MAX_VALUE;
        for (String str : strs) {
            min = Math.min(str.length(), min);
        }

        for (int i = 0; i < min; i++) {
            char lastChar = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if (lastChar != strs[j].charAt(i)) {
                    return builder.toString();
                }
            }
            builder.append(lastChar);
        }

        return builder.toString();
    }
}
