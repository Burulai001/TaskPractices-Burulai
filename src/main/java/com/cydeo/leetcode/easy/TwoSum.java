package com.cydeo.leetcode.easy;

import java.util.HashMap;

public class TwoSum {
    public int[] bruteForceSolution(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

    public int[] optimalSolution(int[] nums, int target) {
        // we are using hashmap to store the number value and its index as "key value pair"
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) { // we are checking whether a key exists in hashmap
                return new int[]{hm.get(target - nums[i]), i}; // if yes we will return it
            }
            hm.put(nums[i], i); // else we will store in hashmap
        }
        return null; // worst case to target sum is found then just send null
    }


}
