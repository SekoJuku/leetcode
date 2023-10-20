package com.github.sekojuku.E392;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        if (t.length() < s.length()) {
            return false;
        }
        var res = 0;
        var j = 0;
        for (int i = 0; i < s.length() && j < t.length(); i++) {
            var current = s.charAt(i);
            while (j < t.length() && res == i) {
                if (current == t.charAt(j)) {
                    res++;
                }
                j++;
            }
        }
        return res == s.length();
    }
}
