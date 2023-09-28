package com.github.sekojuku.M151;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
        System.out.println(reverseWords("  hello world  "));
    }

    public static String reverseWords(String s) {
        var strings = s.trim().split("\\s+");
        var res = new StringBuilder();

        for (int i = strings.length - 1; i >= 0; i--) {
            res.append(strings[i]);
            if (i != 0) {
                res.append(" ");
            }
        }

        return res.toString();
    }
}
