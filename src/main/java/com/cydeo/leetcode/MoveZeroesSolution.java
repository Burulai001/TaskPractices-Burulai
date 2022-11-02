package com.cydeo.leetcode;

import java.util.Arrays;

public class MoveZeroesSolution {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 0, 0, 7};

        int left = 0;
        int right = 1;

        while (right < nums.length) {
            if (nums[left] != 0) {            // 1,2,0,0,0,7
                left++;                    //   l r
                right++;
            } else if (nums[right] == 0) {
                right++;
            } else {                //  if left is 0,right is not zero then we swap them
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
/*
Question-3 Move zeros to end in array
• Given an array of integers, move all the 0s to the back of the array while maintaining the relative order of
the non-zero elements.
• Do this in-place without using extra space or using constant auxiliary space. Don’t create new array or list.
• Please, use two pointer strategy (same direction).
Examples
 Input: [1, 0, 2, 0, 0, 7]
 Output: [1, 2, 7, 0, 0, 0]
 */