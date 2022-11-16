package com.cydeo.binarySearch;

import java.util.Arrays;

public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {3, 7, 7, 7, 7, 9, 11, 18};
        int target = 18;
        System.out.println(Arrays.toString(BruteForceSolution(arr, target)));
    }

    static int[] BruteForceSolution(int[] arr, int target) {
        //O(n),O(1)

        int[] a = {-1, -1};
        if (arr.length == 1 && arr[0] == target) {
            a[0] = 0;
            a[1] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
           if (arr[i]==target){
            a[0] = i;
            break;
        }
    }


        for (int j =arr.length-1;j>=0; j--) {
            if (arr[j]==target){
                a[1] = j;
                break;
            }
    }
        return a;

    }






}



