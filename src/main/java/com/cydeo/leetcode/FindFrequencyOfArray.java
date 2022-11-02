package com.cydeo.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2};

        Map<Integer, Integer> mapArray = new HashMap<>();
        //  loop array elements and count frequencies
        for (int i = 0; i < arr.length; i++) {
            if (mapArray.containsKey(arr[i])) {
                mapArray.put(arr[i], mapArray.get(arr[i]) + 1);
            } else {
                mapArray.put(arr[i], 1);
            }
        }
        // print frequencies with hashmap
        for(Map.Entry entry:mapArray.entrySet()){
                        System.out.println(entry.getKey() + " is " + entry.getValue() + " times");
        }
    }
}

/*
Write a function that takes an integer array, counts each number and prints a sentence to say how
many times a number is repeated. Number order is not important.
EXAMPLE:
input : array = {1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2}
output :
1 is two times
3 is three times
4 is two times
2 is more than ten times
 */