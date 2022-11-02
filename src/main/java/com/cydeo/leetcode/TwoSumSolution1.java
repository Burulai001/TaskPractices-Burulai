package com.cydeo.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution1 {
    public static void main(String[] args) {
        int[] array=new int[]{16, 3, 11, 5, 15};
//        Arrays.sort(array);
        System.out.println(Arrays.toString(twoSumOptimalSolution(array, 8)));
    }
    public static int[] twoSumOptimalSolution(int[] array, int targetValue){
        // Complexity of the solution is O(n)
        // create hashmap

        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <array.length ; i++) {
            int potentialMatch=targetValue-array[i];
            if (map.containsKey(potentialMatch))
                return new int[] {i,map.get(potentialMatch)};
            else map.put(array[i], i);

        }
        return new int[]{};
    }

}

/*
Given an array of integers nums and an integer target, return the two numbers such that they add
up to target.
⮚ Assume that each input would have exactly one solution, and you should not use the same
element twice.
⮚ You can return the answer in any order.
⮚ No solution will return empty array.
⮚ Please, use two pointer strategy which you learned at DSA session to solve this problem
(Hint : you should sort the input first).
⮚ EXAMPLE:
⮚ Input: nums = [16, 3, 11, 5, 15], target = 8
⮚ Output: [3, 5]
⮚ Explanation: Because nums[1] + nums[3] => 3 + 5 = 8, we return [3, 5
 */