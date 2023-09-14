package com.github.sekojuku.M54;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
        System.out.println(spiralOrder(new int[][]{{1}, {2}, {3}}));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        var res = new ArrayList<Integer>();
        traverse(matrix, matrix.length - 1, matrix[0].length - 1, 0, res);
        return res;
    }

    public static void traverse(int[][] arr, int n, int m, int i, ArrayList<Integer> res) {

        if (n < i) return;

        boolean horRight = false;
        boolean horLeft  = false;
        boolean vertDown = false;

        for (int j = i; j <= m; j++) {
            res.add(arr[i][j]);
            horRight = true;
        }

        if (n == i) return;

        for (int j = i + 1; j <= n && horRight; j++) {
            res.add(arr[j][m]);
            vertDown = true;
        }

        for (int j = m - 1; j >= i && vertDown; j--) {
            res.add(arr[n][j]);
            horLeft = true;
        }

        for (int j = n - 1; j > i && horLeft; j--) {
            res.add(arr[j][i]);
        }
        traverse(arr, n - 1, m - 1, i + 1, res);
    }
}
