package com.github.sekojuku.E27;

public class Solution {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[] {3,2,2,3}, 3));
        System.out.println(removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
            j++;
        }
        return i;
    }
}
