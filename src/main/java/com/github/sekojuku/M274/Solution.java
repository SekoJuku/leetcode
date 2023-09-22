package com.github.sekojuku.M274;


public class Solution {

    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{3, 0, 6, 1, 5}));
        System.out.println(hIndex(new int[]{1, 3, 1}));
    }

    public static int hIndex(int[] citations) {
        var res = new int[citations.length + 1];
        for (int citation : citations) {
            var current = Math.min(citations.length, citation);
            for (int j = current; j >= 0; j--) {
                var val = res[j];
                res[j] = val + 1;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = citations.length; i >= 0; i--) {
            if (res[i] == 0)
                continue;
            var current = res[i];
            if (current >= i)
                max = Math.max(i, max);
        }
        return max;
    }
}
