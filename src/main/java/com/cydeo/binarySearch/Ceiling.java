package com.cydeo.binarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,8,15,20,26,27};
        int target=6;
        System.out.println(ceilingSolution(arr,target));
    }


    //return the index of smalled number >= target

    static int ceilingSolution(int[] arr,int target){

        if (target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //find the middle element
            int mid=start+(end-start)/2;

            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
// O(log n)