package com.cydeo.binarySearch;

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,8,15,20,26,27};
        int target=26;
        System.out.println(solution1(arr,target));
    }


    //return the index of a target number
    //return -1 if target number does not exist
    static int solution1(int[] arr,int target){

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
       return -1;
    }
}
