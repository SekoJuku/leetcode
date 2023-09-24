package com.github.sekojuku.M380;

import java.util.HashSet;
import java.util.Random;

public class Solution {

    public static void main(String[] args) {
        var set = new RandomizedSet();
        set.insert(1);
        set.remove(2);
        var var = set.getRandom();
        System.out.println(var);
    }
}

class RandomizedSet {
    private final HashSet<Integer> set;
    private int size;
    private final Random randomizer;

    public RandomizedSet() {
        set = new HashSet<>();
        randomizer = new Random();
        size = 0;
    }

    public boolean insert(int val) {
        if (set.contains(val))
            return false;
        set.add(val);
        size ++;
        return true;
    }

    public boolean remove(int val) {
        if (set.contains(val)) {
            set.remove(val);
            size --;
            return true;
        }
        return false;
    }

    public int getRandom() {
        int index = randomizer.nextInt(size);
        return (int) set.toArray()[index];
    }
}