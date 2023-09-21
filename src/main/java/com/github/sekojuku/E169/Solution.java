package com.github.sekojuku.E169;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {3,2,2}));
        System.out.println(majorityElement(new int[] {2,2,1,1,1,2,2}));
    }

    public static int majorityElement(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        int res = nums[0];
        map.put(res, 1);

        for (int i = 1; i < nums.length; i++) {
            var current = nums[i];

            var occurrences = map.getOrDefault(current, 0);
            occurrences++;

            if (occurrences > map.get(res)) {
                res = current;
            }

            map.put(current, occurrences);
        }

        return res;
    }
}
