package com.github.sekojuku.E121;

public class Solution {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[] {7,6,4,3,1}));
    }

    public static int maxProfit(int[] prices) {
        var min = prices[0];
        var res = Integer.MIN_VALUE;
        for (int price : prices) {

            res = Math.max(res, price - min);
            min = Math.min(min, price);
        }
        System.gc();
        return res;
    }
}
