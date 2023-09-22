package com.github.sekojuku.M189;

public class Solution {

    public static void main(String[] args) {
        rotate(new int[] {1,2,3,4,5}, 1);
    }

    public static void rotate(int[] nums, int k) {
        if (k == 0)
            return;

        int n = nums.length;
        int l = n - k % nums.length;

        if (l == 0)
            return;

        var res = new int[n];

        int j = 0;
        for (int i = l; i < n; i++) {
            res[j] = nums[i];
            j++;
        }

        for (int i = 0; i < l; i++) {
            res[j] = nums[i];
            j++;
        }

        while (j > 0) {
            j--;
            nums[j] = res[j];
        }
    }
}
