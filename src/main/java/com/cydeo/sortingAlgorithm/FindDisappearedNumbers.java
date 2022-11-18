package com.cydeo.sortingAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {

    }

static List<Integer> CyclicSortSolution(int[] nums) {
    int i = 0;
    while (i < nums.length) {
        int correct = nums[i];
        if (nums[i] < nums.length && nums[i] != nums[correct]) {
            swap(nums, i, correct);
        } else {
            i++;
        }
    }

    // find missing numbers
    List<Integer> ans = new ArrayList<>();
    for (int index = 0; index < nums.length; index++) {
        if (nums[index] != index + 1) {
            ans.add(index + 1);
        }
    }
    return ans;

}


    static void swap(int[] arr, int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


}
