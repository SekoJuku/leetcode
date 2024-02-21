package com.github.sekojuku.E905;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{5, 2, 3, 4})));
    }

    public static int[] sortArrayByParity(int[] nums) {

        final var result = new ArrayDeque<Integer>();
        for (var num : nums) {
            if (num % 2 == 0) {
                result.addFirst(num);
            } else {
                result.addLast(num);
            }
        }
        return result.stream()
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}
