package com.github.sekojuku.E88;

public class Solution {

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3,
                new int[]{2, 5, 6}, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] nums1Copy = new int[m];
        System.arraycopy(nums1, 0, nums1Copy, 0, m);

        int p1 = 0;
        int p2 = 0;

        int p = 0;

        while ((p1 < m) && (p2 < n)) {
            nums1[p++] = (nums1Copy[p1] < nums2[p2]) ? nums1Copy[p1++] : nums2[p2++];
        }

        if (p1 < m) {
            System.arraycopy(nums1Copy, p1, nums1, p1 + p2, m + n - p1 - p2);
        }

        if (p2 < n) {
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
        }
    }
}
