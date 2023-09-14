package com.github.sekojuku.M2126;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(asteroidsDestroyed(5, new int[]{4, 9, 23, 4}));
        System.out.println(asteroidsDestroyed(15, new int[]{11,10,676767}));
    }

    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {

        Arrays.sort(asteroids);

        long preSum = mass;
        for (int ast : asteroids) {
            if (preSum < ast) {
                return false;
            }
            preSum += ast;
        }
        return true;
    }
}
