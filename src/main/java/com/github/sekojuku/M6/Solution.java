package com.github.sekojuku.M6;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

    }

    public static String convert(String s, int numRows) {

        var res = new ArrayList<List<String>>();
        for (int i = 0; i < numRows; i++) {
            res.add(new ArrayList<>());
        }

        for (int i = 0; i < s.length(); i += numRows * 2 - 1) {
            compute(s, numRows, res, i);
        }

        var builder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (var str : res.get(i)) {
                builder.append(str);
            }
        }

        return builder.toString();
    }

    public static void compute(String s, int numsRows, ArrayList<List<String>> arr, int i) {
        var breakPoint = numsRows - 1;
        for (int j = i; j < i + (numsRows * 2 - 1) && j < s.length(); j++) {
            var current = s.charAt(j);
        }
    }
}
