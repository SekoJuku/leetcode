package com.github.sekojuku.M735;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{5, 10, -5})));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        var deque = new ArrayDeque<Integer>();
        var res = new ArrayList<Integer>();
        for (int j : asteroids) {
            if (j > 0) deque.push(j);
            else {
                var destroyed = false;
                while (!deque.isEmpty()) {
                    var asteroid            = deque.peek();
                    var currentAsteroidSize = Math.abs(j);
                    if (asteroid > currentAsteroidSize) {
                        destroyed = true;
                        break;
                    } else if (asteroid == currentAsteroidSize) {
                        deque.pop();
                        destroyed = true;
                        break;
                    } else {
                        deque.pop();
                    }
                }
                if (!destroyed) {
                    res.add(j);
                }
            }
        }
        while (!deque.isEmpty()) {
            res.add(deque.pollLast());
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

}
