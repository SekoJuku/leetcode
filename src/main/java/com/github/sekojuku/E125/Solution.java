package com.github.sekojuku.E125;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        var result = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        for (int i = 0, j = result.length() - 1; i < result.length() && j >= 0; i++, j--) {
            if (result.charAt(i) != result.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
