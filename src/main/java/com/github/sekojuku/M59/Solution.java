package com.github.sekojuku.M59;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }

    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        populate(res, n - 1, 0, 1);
        return res;
    }

    public static void populate(int[][] arr, int n, int i, int k) {
        if (n < i || arr.length * arr.length < k) {
            return;
        }
        for (int j = i; j <= n; j ++) {
            arr[i][j] = k;
            k ++;
        }
        for (int j = i + 1; j < n; j++) {
            arr[j][n] = k;
            k ++;
        }

        for (int j = n; j > i; j --) {
            arr[n][j] = k;
            k ++;
        }
        for (int j = n; j > i; j --) {
            arr[j][i] = k;
            k ++;
        }
        populate(arr, n - 1, i + 1, k);
    }
}
