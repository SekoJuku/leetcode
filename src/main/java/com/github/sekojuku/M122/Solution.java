package com.github.sekojuku.M122;

public class Solution {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    public static int maxProfit(int[] prices) {
        var ans = 0;
        var min = Integer.MAX_VALUE;
        for (int price : prices) {
            min = Math.min(min, price);
            if (price - min > 0) {
                ans += price - min;
                min = price;
            }
        }
        return ans;
    }
}
