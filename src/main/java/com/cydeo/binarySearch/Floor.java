package com.cydeo.binarySearch;

public class Floor {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,8,15,20,26,27};
        int target=6;
        System.out.println(floorSolution(arr,target));
    }


    //return the index of the greatest number >= target

    static int floorSolution(int[] arr,int target){

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
        return end;
    }
}

// O(log n)