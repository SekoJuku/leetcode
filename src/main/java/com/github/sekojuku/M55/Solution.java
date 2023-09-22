package com.github.sekojuku.M55;

public class Solution {

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(canJump(new int[]{3, 2, 1, 0, 4}));
    }

    public static boolean canJump(int[] nums) {
        if (nums.length == 1)
            return true;
        if (nums[0] == 0)
            return false;
        var dp = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (dp[i] == 0 && i != 0)
                break;
            for (int j = 1; j <= nums[i] && i+j < nums.length; j++) {
                dp[i+j] = Math.min(dp[i] + 1, (dp[i+j] == 0 ? Integer.MAX_VALUE : dp[i+j]));
            }
        }
        return dp[nums.length-1] != 0;
    }
}
