package com.cydeo.leetcode;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(solution(nums)));

    }

    public static int[] solution(int[] nums){

      // Array to store all left multiplication
      int[] left = new int[nums.length];

      // Array to store all right multiplication
        int[] right = new int[nums.length];

        //fill all the left array
        left[0]=1;
        for (int i =1; i<nums.length; i++){
            left[i]=left[i-1]*nums[i-1];  // 1*2*3*4
        }
     //fill all the right array
        right[nums.length-1]=1;
        for (int i=nums.length-2; i>-1;i--){
            right[i]=right[i+1]*nums[i+1];
        }

        //multiply all on left * multiply all on right
        int[] result=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i]=left[i]*right[i];
        }
        return result;
    }


}
