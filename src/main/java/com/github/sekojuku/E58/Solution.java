package com.github.sekojuku.E58;

public class Solution {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("THe world"));
    }

    public static int lengthOfLastWord(String s) {
        var strings = s.split(" ");
        return strings[strings.length-1].length();
    }
}
