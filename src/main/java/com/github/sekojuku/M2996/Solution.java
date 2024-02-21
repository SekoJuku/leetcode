package com.github.sekojuku.M2996;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(divideArray(new int[]{1, 3, 4, 8, 7, 9, 3, 5, 1}, 2)));
        System.out.println(Arrays.deepToString(divideArray(new int[]{1, 3, 3, 2, 7, 3}, 3)));
        System.out.println(Arrays.deepToString(divideArray(new int[]{33, 26, 4, 18, 16, 24, 24, 15, 8, 18, 34, 20, 24, 16, 3}, 16)));
    }

    public static int[][] divideArray(int[] nums, int k) {

        var min = -1;
        var iterator = 0;
        final var ans = new HashMap<Integer, List<Integer>>();
        final var ints = Arrays.stream(nums).sorted().toArray();

        for (var n : ints) {

            if (ans.getOrDefault(iterator, new ArrayList<>()).size() >= 3) {
                iterator++;
                min = -1;
            }
            final var list = ans.getOrDefault(iterator, new ArrayList<>());

            if (min == -1) {
                min = n;
            }

            if (n - min > k) {
                return new int[][]{};
            }

            list.add(n);
            ans.put(iterator, list);

        }

        var result = new int[ans.size()][3];
        ans.forEach((key, v) -> result[key] = v.stream().mapToInt(Integer::intValue).toArray());
        return result;
    }
}
