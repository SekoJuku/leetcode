package com.github.sekojuku.E26;


public class Solution {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1,1,2}));
        System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
    }

    public static int removeDuplicates(int[] nums) {
        var i = 1;
        var j = 1;
        while (j < nums.length) {
            var b = nums[j - 1] == nums[j];
            if (!b) {
                nums[i++] = nums[j];
            }
            j++;
        }
        return i;
    }
}
