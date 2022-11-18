package com.cydeo.sortingAlgorithm;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr={3,0,1};
        System.out.println(cyclicSortSolution(arr));
    }
    static int bruteForceSolution(int[] arr) {
        Arrays.sort(arr); // time complexity of sort method is from O(n) to O(n log(n))
        for (int index = 0; index < arr.length; index++) {
            if (index != arr[index])
                return index;
        }
        return arr.length;
    }

    static int binarySearchSolution(int[] arr) {

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

    static int cyclicSortSolution(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (index != arr[index]) {
                return index;
            }
        }
        return arr.length;
    }


    static void swap(int[] arr, int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    }