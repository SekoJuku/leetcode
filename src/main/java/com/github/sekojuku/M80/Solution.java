package com.github.sekojuku.M80;

public class Solution {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1,1,1,2,2,3}));
        System.out.println(removeDuplicates(new int[] {0,0,1,1,1,1,2,3,3}));
    }

    public static int removeDuplicates(int[] nums) {
        var i = 1;
        var j = 1;
        var b = false;
        while (j < nums.length) {
            var current = nums[j];
            var previous = nums[j - 1];
            if (previous == current) {
                if (!b) {
                    nums[i++] = nums[j];
                    b = true;
                }
            } else {
                nums[i++] = nums[j];
                b = false;
            }

            j++;
        }

        return i;
    }
}
