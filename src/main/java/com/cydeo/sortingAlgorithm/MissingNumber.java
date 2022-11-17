package com.cydeo.sortingAlgorithm;

import java.util.Arrays;

public class MissingNumber {


    static int BruteForceSolution(int[] arr) {
        Arrays.sort(arr); // time complexity of sort method is from O(n) to O(n log(n))
        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i])
                return i;
        }
        return arr.length;
    }

    static int BinarySearchSolution(int[] arr) {

        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
       
       
        if(arr.length==0){
            return 0;
        }

        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]>mid){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;

    }
}
